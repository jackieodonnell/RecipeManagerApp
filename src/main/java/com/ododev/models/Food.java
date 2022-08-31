package com.ododev.models;

public class Food {
    private String foodId;
    private String foodLabel;
    private String foodCategory;

    public Food(){}

    public Food(String foodId, String foodLabel, String foodCategory) {
        this.foodId = foodId;
        this.foodLabel = foodLabel;
        this.foodCategory = foodCategory;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodLabel() {
        return foodLabel;
    }

    public void setFoodLabel(String foodLabel) {
        this.foodLabel = foodLabel;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }
}
