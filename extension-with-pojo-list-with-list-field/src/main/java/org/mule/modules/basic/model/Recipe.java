package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.List;

/**
 * Recipe description
 */
public class Recipe {

    /**
     * Name of the dish for this recipe
     */
    @Parameter
    private String dishName;

    /**
     * Summery of the recipe
     */
    @Parameter
    private String description;

    @Parameter
    private List<Ingredient> ingredients;
}
