package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.util.Date;

public class BasicOperations
{

    /**
     * Operation With String description
     */
    public String operationWithString(@UseConfig BasicExtensionConfig config, String stringParam, int intPrimitiveParam, Integer integerParam, Boolean booleanParam, boolean booleanPrimitiveParam, Date dateParam, float floatPrimitiveParam, Float floatParam, double doublePrimitiveParam, Double doubleParam)
    {
        return "";
    }

}
