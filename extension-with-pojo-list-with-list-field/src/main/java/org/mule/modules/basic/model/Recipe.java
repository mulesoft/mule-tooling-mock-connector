package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;

import java.util.List;

/**
 * Recipe description
 */
@TypeDsl(allowTopLevelDefinition = true)
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
