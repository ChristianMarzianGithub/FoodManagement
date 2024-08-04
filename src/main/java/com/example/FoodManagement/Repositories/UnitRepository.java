package com.example.FoodManagement.Repositories;

import com.example.FoodManagement.BE.UnitBE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<UnitBE, Integer> {
}
