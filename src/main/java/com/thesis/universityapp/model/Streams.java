package com.thesis.universityapp.model;

import javax.persistence.*;

@Entity
@Table(name = "streams")
public class Streams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "master_id")
    private Master master;

    @Column(name = "name")
    private String name;

    public Streams(Long id, Master master, String name) {
        this.id = id;
        this.master = master;
        this.name = name;
    }

    public Streams() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// getters and setters

}
