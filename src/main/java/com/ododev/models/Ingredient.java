package com.ododev.models;

public class Ingredient {
    private String description;
    private float quantity;
    private Measure measure;
    private float weight;
    private Food food;
    private String foodCategory;

    public Ingredient(){}

    public Ingredient(String description, float quantity, Measure measure, float weight, Food food, String foodCategory) {
        this.description = description;
        this.quantity = quantity;
        this.measure = measure;
        this.weight = weight;
        this.food = food;
        this.foodCategory = foodCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }
}
