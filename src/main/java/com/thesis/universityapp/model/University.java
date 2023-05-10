
package com.thesis.universityapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name = "university_name", nullable = false)
    private String name;
    @Column(name = "email_address", nullable = true)
    private String email;
//    @OneToMany(mappedBy = "university",cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonBackReference
    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("university")
    private List<Department> departments = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "keycloak_user_id", referencedColumnName = "id")
    private KeycloakUser keycloakUser;

    public University() {
    // blind constructor
    }

//    public University(String name, String email, List<Call> calls) {
//        super();
//        this.name = name;
//        this.email = email;
////        this.calls = calls;
//    }


    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getUniversityID() { return id; }
    public void setUniversityID(String universityID) { this.id = universityID; }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }



    @Override
    public String toString() {
        return "University{" +
                "universityID=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
