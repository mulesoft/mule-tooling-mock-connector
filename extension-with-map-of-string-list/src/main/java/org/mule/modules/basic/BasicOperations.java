package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.List;
import java.util.Map;

public class BasicOperations
{

    /**
     * Operation With Map description
     *
     * @param config        config description
     * @param mapParameters Map param description
     */
    @MediaType(MediaType.APPLICATION_PLAIN)
    public String operationWithMap(@Config BasicExtensionConfig config, Map<String, List<String>> mapParameters)
    {
        return null;
    }

}
