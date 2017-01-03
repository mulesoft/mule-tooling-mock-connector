package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param config config description
     * @param param  String param description
     */
    public String operationWithExclusiveOptionalGroup(@UseConfig BasicExtensionConfig config, String param, @ParameterGroup(name = "Exclusive Group") ExclusiveOptionalGroup basicGroup)
    {
        return param;
    }

}
