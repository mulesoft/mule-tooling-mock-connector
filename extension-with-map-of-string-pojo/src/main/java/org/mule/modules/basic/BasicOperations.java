package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.modules.basic.model.NotTopLevelPojo;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Optional;

import java.util.Map;

public class BasicOperations
{

    /**
     * Operation With Map description
     *
     * @param mapParameters Map param description
     */
    public Ingredient operationWithMap(@Config BasicExtensionConfig config, Map<String, Ingredient> mapParameters)
    {
        return null;
    }

    public NotTopLevelPojo operationWithMapOfNotTopLevelPojo(@Config BasicExtensionConfig config, @Optional(defaultValue = "#[payload]") Map<String, NotTopLevelPojo> mapParam)
    {
        return null;
    }


}
