package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param config The extension config
     * @param param  String param description
     */
    @Summary("Operation with summary")
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithString(@Config BasicExtensionConfig config, String param)
    {
        return param;
    }

}
