package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.Example;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param param String param description
     */
    @MediaType(MediaType.APPLICATION_PLAIN)
    public String operationWithString(@Config BasicExtensionConfig config, String param)
    {
        return param;
    }

    public void setUsername(@Example("Example for Operations's Parameter") String username)
    {

    }


}
