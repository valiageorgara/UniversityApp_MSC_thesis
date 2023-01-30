package com.thesis.universityapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "call")
public class Call {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "expiration", nullable = false)
    private Date expiration;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "priority", nullable = false)
    private Integer priority;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;
    @OneToMany(mappedBy = "call",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Application> applications =new ArrayList<>();

    public Call(Long id, Date expiration, String title, Integer priority, University university, List<Application> applications) {
        this.id = id;
        this.expiration = expiration;
        this.title = title;
        this.priority = priority;
        this.university = university;
        this.applications = applications;
    }

    public Call(Date expiration, String title, Integer priority, University university) {

        this.expiration = expiration;
        this.title = title;
        this.priority = priority;
        this.university = university;
    }

    public Call() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
