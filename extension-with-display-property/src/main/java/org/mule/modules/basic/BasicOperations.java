package org.mule.modules.basic;

import org.mule.modules.basic.model.SOSPojo;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Example;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param config config description
     * @param param  String param description
     */
    @DisplayName("Custom operation label")
    public String operationWithString(@UseConfig BasicExtensionConfig config, @DisplayName("Foo Operation Parameter") String param, @DisplayName("SOS") SOSPojo pojoParam, @Example("Example hint") String paramWithExample)
    {
        return param;
    }

}
