package com.ododev.models;

import java.util.Arrays;

public class Recipe {
    private int recipeId;
    private String label;
    private String uri;
    private String image;
    private String url;
    private String source;
    private Cuisine cuisine;
//    private Meal meal;
    private double yield;
    private String ingredientLines;
//    private Ingredient[] ingredients;
    private int totalTime;
    private String instructions;

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Cuisine getCuisineType() {
        return cuisine;
    }

    public void setCuisineType(Cuisine cuisine) {
        this.cuisine = cuisine;
    }
//
//    public Meal getMealType() {
//        return meal;
//    }
//
//    public void setMealType(Meal meal) {
//        this.meal = meal;
//    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public String getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(String ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

//    public Ingredient[] getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(Ingredient[] ingredients) {
//        this.ingredients = ingredients;
//    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", recipeLabel='" + label + '\'' +
                ", uri='" + uri + '\'' +
                ", imgUrl='" + image + '\'' +
                ", recipeUrl='" + url + '\'' +
                ", recipeSource='" + source + '\'' +
                ", cuisineType=" + cuisine +

                ", yield=" + yield +
                ", ingredientLines='" + ingredientLines + '\'' +

                ", totalTime=" + totalTime +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
