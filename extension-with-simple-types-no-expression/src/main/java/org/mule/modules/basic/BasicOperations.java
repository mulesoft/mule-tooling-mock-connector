package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.introspection.parameter.ExpressionSupport;

import java.util.Date;

public class BasicOperations
{

    /**
     * Operation With String description
     */
    public String operationWithString(@UseConfig BasicExtensionConfig config, @Expression(ExpressionSupport.NOT_SUPPORTED) String stringParam, @Expression(ExpressionSupport.NOT_SUPPORTED) int intPrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Integer integerParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Boolean booleanParam, @Expression(ExpressionSupport.NOT_SUPPORTED) boolean booleanPrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Date dateParam, @Expression(ExpressionSupport.NOT_SUPPORTED) float floatPrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Float floatParam, @Expression(ExpressionSupport.NOT_SUPPORTED) double doublePrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Double doubleParam)
    {
        return "";
    }

}
