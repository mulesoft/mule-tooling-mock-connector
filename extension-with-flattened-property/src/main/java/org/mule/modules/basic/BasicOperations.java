package org.mule.modules.basic;

import org.mule.modules.basic.model.ContainerPojo;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param config config description
     * @param param  String param description
     */
    @DisplayName("Custom operation label")
    public String operationWithString(@Config BasicExtensionConfig config, String param, ContainerPojo pojoParam)
    {
        return param;
    }

}
