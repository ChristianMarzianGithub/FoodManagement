package com.example.FoodManagement.BE;

import jakarta.persistence.*;

@Entity
@Table(name="Unit")
public class UnitBE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    @Column(name = "name")
    private String NAME;
}