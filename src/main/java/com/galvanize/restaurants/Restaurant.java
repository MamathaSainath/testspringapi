package com.galvanize.restaurants;
import javax.persistence.*;


@Entity
@Table(name = "Restaurant")

public class Restaurant {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSlNumber() {
        return slNumber;
    }

    public void setSlNumber(int slNumber) {
        this.slNumber = slNumber;
    }

    @Column
    private String name;
    private int slNumber;

}