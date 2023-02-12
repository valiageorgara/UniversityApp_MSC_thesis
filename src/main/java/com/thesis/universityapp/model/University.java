
package com.thesis.universityapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private long universityID;
    @Column(name = "university_name", nullable = false)
    private String name;
    @Column(name = "email_address", nullable = true)
    private String email;
    @OneToMany(mappedBy = "university",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Call> calls = new ArrayList<>();

    public University() {
    // blind constructor
    }

    public University(String name, String email, List<Call> calls) {
        super();
        this.name = name;
        this.email = email;
        this.calls = calls;
    }


    public Long getUniversityID() { return universityID; }
    public void setUniversityID(long universityID) { this.universityID = universityID; }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Call> getCalls() {
        return calls;
    }

    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityID=" + universityID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
