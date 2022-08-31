package com.ododev.dao;

import com.ododev.models.Recipe;

import java.util.List;

public interface RecipeDAO {

    List<Recipe> listAllRecipes();

    Recipe getRecipe(int id);

    Recipe saveRecipe(Recipe recipeToSave);

    Recipe createNewRecipe(Recipe recipeToCreate);

    Recipe updateRecipe(Recipe recipeToUpdate);

    boolean deleteRecipe(int id);
}
