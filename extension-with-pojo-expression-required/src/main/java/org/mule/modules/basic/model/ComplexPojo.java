package org.mule.modules.basic.model;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public class ComplexPojo
{
    @Parameter
    private int intField;

    @Parameter
    private Ingredient ingredient;

    @Parameter
    @Expression(ExpressionSupport.REQUIRED)
    private Ingredient ingredientNoExpression;

    public int getIntField()
    {
        return intField;
    }

    public void setIntField(int intField)
    {
        this.intField = intField;
    }

    public Ingredient getIngredient()
    {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient)
    {
        this.ingredient = ingredient;
    }

    public Ingredient getIngredientNoExpression()
    {
        return ingredientNoExpression;
    }

    public void setIngredientNoExpression(Ingredient ingredientNoExpression)
    {
        this.ingredientNoExpression = ingredientNoExpression;
    }
}
