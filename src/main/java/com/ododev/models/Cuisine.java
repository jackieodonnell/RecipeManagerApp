package com.ododev.models;

public class Cuisine {
    private String cuisineType;

    public Cuisine(){}

    public Cuisine(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }
}
