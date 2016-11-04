package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Parameter;

import java.util.Map;

public class PojoWithMap
{

    @Parameter
    private Map<String, String> properties;

    public Map<String, String> getProperties()
    {
        return properties;
    }
}
