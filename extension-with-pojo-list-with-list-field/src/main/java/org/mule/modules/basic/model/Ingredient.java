package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public class Ingredient
{
    private String description;

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
