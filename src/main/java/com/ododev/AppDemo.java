package com.ododev;

import com.ododev.models.Recipe;
import com.ododev.services.RESTRecipeService;

public class AppDemo {

    public static void main(String[] args) {
        RESTRecipeService restRecipeService = new RESTRecipeService();
        Recipe recipe = restRecipeService.getRecipe("b037eca277fb1bf75f2605cd946a3d34");
        System.out.println(recipe);
    }

}
