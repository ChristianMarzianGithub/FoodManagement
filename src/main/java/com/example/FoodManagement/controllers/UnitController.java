package com.example.FoodManagement.controllers;

import com.example.FoodManagement.BE.UnitBE;
import com.example.FoodManagement.Services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/unit")
public class UnitController {

    @Autowired
    UnitService unitService;

    @GetMapping("getAll")
    public List<UnitBE> getAllUnits(){
        unitService.addExmpleUnit();
        return unitService.getAll();
    }
}