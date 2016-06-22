package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.Parameter;

public class Ingredient
{

    @Parameter
    private String description;

    @Parameter
    private float amount;

    public float getAmount()
    {
        return amount;
    }

    public void setAmount(float amount)
    {
        this.amount = amount;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
