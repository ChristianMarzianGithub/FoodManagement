package com.example.FoodManagement.Services;

import com.example.FoodManagement.BE.UnitBE;
import com.example.FoodManagement.Repositories.FoodRepository;
import com.example.FoodManagement.Repositories.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitService {

    @Autowired
    UnitRepository unitRepository;

    public List<UnitBE> getAll(){
        return unitRepository.findAll();
    }

    public void addExmpleUnit(){
        UnitBE unitBE = new UnitBE();
        unitBE.setNAME("example " + unitBE.getID());

        unitRepository.save(unitBE);
    }
}
