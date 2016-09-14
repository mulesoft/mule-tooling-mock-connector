package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

/**
 * Dummy Pojo for test
 */
@XmlHints(allowTopLevelDefinition = true)
public class Ingredient
{
    private String type;
    private double amount;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
}
