package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.Date;

public class BasicOperations
{

    /**
     * Operation With String description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithString(@Config BasicExtensionConfig config, @Expression(ExpressionSupport.NOT_SUPPORTED) String stringParam, @Expression(ExpressionSupport.NOT_SUPPORTED) int intPrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Integer integerParam, @Expression(ExpressionSupport.NOT_SUPPORTED) boolean booleanPrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Date dateParam, @Expression(ExpressionSupport.NOT_SUPPORTED) float floatPrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Float floatParam, @Expression(ExpressionSupport.NOT_SUPPORTED) double doublePrimitiveParam, @Expression(ExpressionSupport.NOT_SUPPORTED) Double doubleParam)
    {
        return "";
    }

}
