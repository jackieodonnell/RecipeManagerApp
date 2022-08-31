package com.ododev.services;

import com.ododev.models.Cuisine;
import com.ododev.models.Recipe;

import java.util.List;

public interface RecipeService {

    Recipe getRecipe(String uri);

    Recipe[] searchRecipes(String searchTerm);
}
