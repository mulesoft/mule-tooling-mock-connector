package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.Date;

public class BasicOperations
{

    /**
     * Operation With String description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithString(@Config BasicExtensionConfig config, String stringParam, int intPrimitiveParam, Integer integerParam, boolean booleanPrimitiveParam, Date dateParam, float floatPrimitiveParam, Float floatParam, double doublePrimitiveParam, Double doubleParam)
    {
        return "";
    }

}
