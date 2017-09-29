package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations
{

    /**
     * Operation With One Pojo description
     *
     * @param config                config description
     * @param ingredientAtOperation Ingredient at operation description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithOnePojo(@Config BasicExtensionConfig config, Ingredient ingredientAtOperation)
    {
        return null;
    }

    /**
     * Operation With One Content Pojo description
     *
     * @param config                config description
     * @param ingredientAtOperation Ingredient at operation description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithOneContent(@Config BasicExtensionConfig config, @Content Ingredient ingredientAtOperation)
    {
        return null;
    }

    /**
     * Operation With Pojos description
     *
     * @param config                 config description
     * @param complexPojoAtOperation Complex Pojo at operation description
     * @param ingredientAtOperation  Ingredient at operation description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithPojo(@Config BasicExtensionConfig config, @Content ComplexPojo complexPojoAtOperation, Ingredient ingredientAtOperation)
    {
        return null;
    }
}
