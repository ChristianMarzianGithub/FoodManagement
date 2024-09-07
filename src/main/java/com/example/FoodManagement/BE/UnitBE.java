package com.example.FoodManagement.BE;

import jakarta.persistence.*;

@Entity
@Table(name="Unit", schema="FOOD")
public class UnitBE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;



    @Column(name = "name")
    private String NAME;

    public Integer getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
    @Override
    public String toString() {
        return "UnitBE{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                '}';
    }
}