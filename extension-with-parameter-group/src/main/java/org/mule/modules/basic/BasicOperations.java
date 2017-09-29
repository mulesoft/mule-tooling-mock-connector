package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;

public class BasicOperations
{

    /**
     * Operation With Pojo description
     *
     * @param config                config description
     * @param ingredientShowInDsl Ingredient at operation description
     */
    @MediaType(MediaType.APPLICATION_PLAIN)
    public String operationWithPojoShowInDsl(@Config BasicExtensionConfig config, @ParameterGroup(name = "Ingredient shown in DSL", showInDsl = true) Ingredient ingredientShowInDsl)
    {
        return null;
    }

    @MediaType(MediaType.APPLICATION_PLAIN)
    public String operationWithPojo(@Config BasicExtensionConfig config, @ParameterGroup(name = "Ingredient") Ingredient ingredientAtOperation)
    {
        return null;
    }

}
