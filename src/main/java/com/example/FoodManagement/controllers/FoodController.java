package com.example.FoodManagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @GetMapping("/getExample")
    public String getExample(){





        return "welcome to /getExample";
    }
}