package com.ododev.services;

import com.ododev.models.Cuisine;
import com.ododev.models.Recipe;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RESTRecipeService implements RecipeService {
    private static final String API_BASE_URL = "https://api.edamam.com/api/recipes/v2/";
    private static final String APP_ID = "337dec30";
    private static final String API_KEY = "470f0c601b964f4c459cc7e1ceafd13f";
    private static final String APPEND = "&app_id=337dec30&app_key=470f0c601b964f4c459cc7e1ceafd13f";
    private final RestTemplate restTemplate = new RestTemplate();


    @Override
    public Recipe getRecipe(String uri) {
        return restTemplate.getForObject(API_BASE_URL + uri + "?type=public" + APPEND, Recipe.class);
    }

    @Override
    public Recipe[] searchRecipes(String searchTerm) {
        return restTemplate.getForObject(API_BASE_URL + "&q=" + searchTerm + APPEND, Recipe[].class);
    }


}
