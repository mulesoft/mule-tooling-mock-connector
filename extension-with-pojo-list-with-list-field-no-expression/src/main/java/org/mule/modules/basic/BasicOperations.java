package org.mule.modules.basic;

import org.mule.modules.basic.model.Comment;
import org.mule.modules.basic.model.Recipe;
import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Optional;

import java.util.List;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param config  config description
     * @param recipes String param description
     */
    public List<Recipe> operationWithPojoList(@Config BasicExtensionConfig config,
                                              @Expression(ExpressionSupport.NOT_SUPPORTED) List<Recipe> recipes,
                                              @Expression(ExpressionSupport.NOT_SUPPORTED) @Optional List<Comment> optionalNoExpressions,
                                              @Expression(ExpressionSupport.REQUIRED) @Optional List<Comment> optionalWithExpressions,
                                              @Expression(ExpressionSupport.REQUIRED) List<Comment> requiredFromExpressions
    )

    {
        return recipes;
    }

}
