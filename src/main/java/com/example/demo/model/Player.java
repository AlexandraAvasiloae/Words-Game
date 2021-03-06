package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@ToString
@EqualsAndHashCode
@Entity
@Table(name = "PLAYERS")

public class Player {

    @Id
    private int id;
    private String name;
    private int scor;

    public Player(@JsonProperty("id") int id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
    public Player(){

    }

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name="name")

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Basic
    @Column(name="scor")
    public int getScor() {
        return scor;
    }

    public void setScor(int scor) {
        this.scor = scor;
    }

}
