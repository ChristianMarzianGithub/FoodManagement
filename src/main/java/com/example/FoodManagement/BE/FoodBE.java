package com.example.FoodManagement.BE;

import com.example.FoodManagement.BE.UnitBE;
import jakarta.persistence.*;

@Entity
@Table(name="FOOD")
public class FoodBE{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "calories")
    private String calories;

    @Column(name = "FAT")
    private String fat;

    @Column(name = "CARBOHYDRATES")
    private String carbohydrates;

    @Column(name = "FIBER")
    private String fiber;

    @Column(name = "PROTEIN")
    private String protein;

    @Column(name = "PORTION_AMOUNT")
    private String portion_amount;

    @OneToOne
    private UnitBE UNIT;


    public UnitBE getUNIT() {
        return UNIT;
    }

    public void setUNIT(UnitBE UNIT) {
        this.UNIT = UNIT;
    }

    public String getPortion_amount() {
        return portion_amount;
    }

    public void setPortion_amount(String portion_amount) {
        this.portion_amount = portion_amount;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getFiber() {
        return fiber;
    }

    public void setFiber(String fiber) {
        this.fiber = fiber;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FoodBE{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", fat='" + fat + '\'' +
                ", carbohydrates='" + carbohydrates + '\'' +
                ", fiber='" + fiber + '\'' +
                ", protein='" + protein + '\'' +
                ", portion_amount='" + portion_amount + '\'' +
                ", UNIT=" + UNIT +
                '}';
    }
}