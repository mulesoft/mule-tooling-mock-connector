package org.mule.modules.basic.model;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import java.util.List;

/**
 * Recipe description
 */
@TypeDsl(allowTopLevelDefinition = true)
public class Recipe {

    /**
     * Summery of the recipe
     */
    @Parameter
    private String description;

    /**
     * Name of the dish for this recipe
     */
    @Parameter
    private String dishName;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private List<Ingredient> ingredients;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Optional
    @Parameter
    private List<Comment> comments;

    @Expression(ExpressionSupport.REQUIRED)
    @Optional
    @Parameter
    private List<Comment> optionalCommentsFromExpression;

    @Expression(ExpressionSupport.REQUIRED)
    @Parameter
    private List<Comment> commentsFromExpression;

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

    public List<Comment> getComments()
    {
        return comments;
    }

    public void setComments(List<Comment> comments)
    {
        this.comments = comments;
    }

    public List<Comment> getOptionalCommentsFromExpression()
    {
        return optionalCommentsFromExpression;
    }

    public void setOptionalCommentsFromExpression(List<Comment> optionalCommentsFromExpression)
    {
        this.optionalCommentsFromExpression = optionalCommentsFromExpression;
    }

    public List<Comment> getCommentsFromExpression()
    {
        return commentsFromExpression;
    }

    public void setCommentsFromExpression(List<Comment> commentsFromExpression)
    {
        this.commentsFromExpression = commentsFromExpression;
    }
}
