package org.mule.modules.basic;

import org.mule.modules.basic.model.SimplePojo;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations
{

    /**
     * Operation With One Pojo description
     *
     * @param config                config description
     * @param pojoAtOperation SimplePojo at operation description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithOnePojo(@Config BasicExtensionConfig config, SimplePojo pojoAtOperation)
    {
        return null;
    }

}
