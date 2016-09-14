package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

/**
 * Recipe description
 */
@XmlHints(allowTopLevelDefinition = true)
public class Recipe {

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

    /**
     * Name of the dish for this recipe
     */
    private String dishName;

    /**
     * Summery of the recipe
     */
    private String description;

}
