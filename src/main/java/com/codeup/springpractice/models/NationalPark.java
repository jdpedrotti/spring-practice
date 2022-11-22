package com.codeup.springpractice.models;

import javax.persistence.*;

@Entity
@Table(name = "parks")
public class NationalPark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NationalPark() {
    }

    public NationalPark(String name) {
        this.name = name;
    }





}
