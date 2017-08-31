package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.reference.ConfigReference;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Basic Connector with @ConfigReference
 */
@Extension(name = "ConfigRef")
@Operations({BasicOperations.class})
public class BasicExtension
{

    @ConfigReference(name = "http",namespace = "requesterConfig")
    @Parameter
    private String requesterConfig;

    public String getRequesterConfig()
    {
        return requesterConfig;
    }

    public void setRequesterConfig(String requesterConfig)
    {
        this.requesterConfig = requesterConfig;
    }
}
