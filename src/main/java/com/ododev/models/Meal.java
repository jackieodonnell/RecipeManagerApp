package com.ododev.models;

public class Meal {
    private String mealType;

    public Meal(){}

    public Meal(String mealType) {
        this.mealType = mealType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
}
