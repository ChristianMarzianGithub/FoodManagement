package com.example.FoodManagement.Services;

import com.example.FoodManagement.BE.FoodBE;
import com.example.FoodManagement.Repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepository;

    public List<FoodBE> getAll(){
        return foodRepository.findAll();
    }

}