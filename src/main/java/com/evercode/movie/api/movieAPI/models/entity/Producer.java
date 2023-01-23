package com.evercode.movie.api.movieAPI.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCER")
public class Producer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 255)
    private String name;

    public Producer() {
    }

    public Producer(String name) {
        this.name = name;
    }

    public Producer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
