package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.reference.ConfigReference;

public class PojoWithRef
{

    @ConfigReference(namespace = "ANYPOINT_MQ", name = "CONFIG")
    @Parameter
    @Optional
    private String configRefAtPojo;

    public String getConfigRefAtPojo()
    {
        return configRefAtPojo;
    }

    public void setConfigRefAtPojo(String configRefAtPojo)
    {
        this.configRefAtPojo = configRefAtPojo;
    }
}
