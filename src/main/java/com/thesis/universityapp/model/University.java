
package com.thesis.universityapp.model;

import javax.persistence.*;

@Entity
@Table(name = "university")
public class University {

    private Long universityID;
    private String name;
    private String email;
    private  String password;

    public University() {
    // blind constructor
    }

    public University(String name, String email, String password) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id", nullable = false)
    public Long getUniversityID() { return universityID; }
    public void setUniversityID(long universityID) { this.universityID = universityID; }

    @Column(name = "university_name", nullable = false)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Column(name = "email_address", nullable = true)
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Column(name = "university_password", nullable = false)
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "University{" +
                "universityID=" + universityID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
