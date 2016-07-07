package org.mule.modules.basic.model;

import java.util.List;

/**
 * Recipe description
 */
public class Recipe {

    /**
     * Summery of the recipe
     */
    private String description;

    /**
     * Name of the dish for this recipe
     */
    private String dishName;

    private List<Ingredient> ingredients;

    public String getDishName()
    {
        return dishName;
    }

    public void setDishName(String dishName)
    {
        this.dishName = dishName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Ingredient> getIngredients()
    {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients)
    {
        this.ingredients = ingredients;
    }

}
