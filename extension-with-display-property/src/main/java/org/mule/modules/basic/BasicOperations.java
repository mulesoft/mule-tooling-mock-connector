package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;
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
    public String operationWithString(@UseConfig BasicExtensionConfig config, @DisplayName("Foo Operation Parameter") String param)
    {
        return param;
    }

}
