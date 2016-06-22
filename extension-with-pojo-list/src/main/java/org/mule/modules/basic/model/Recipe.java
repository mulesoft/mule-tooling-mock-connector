package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.Parameter;

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

}
