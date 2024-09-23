package com.example.FoodManagement.BE;

import jakarta.persistence.*;

@Entity
@Table(name="CUSTOMER", schema="FOOD")
public class CustomerBE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false, unique = true)
    private String username;
}
