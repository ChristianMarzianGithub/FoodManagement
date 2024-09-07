package com.example.FoodManagement.BE;

import jakarta.persistence.*;

@Entity
@Table(name="USER", schema="FOOD")
public class UserBE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false, unique = true)
    private String username;
}
