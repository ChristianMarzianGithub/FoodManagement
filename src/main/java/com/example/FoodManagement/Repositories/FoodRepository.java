package com.example.FoodManagement.Repositories;

import com.example.FoodManagement.BE.FoodBE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodRepository extends JpaRepository<FoodBE, Integer> {
}