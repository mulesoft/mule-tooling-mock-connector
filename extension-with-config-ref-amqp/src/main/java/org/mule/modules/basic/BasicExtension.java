package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.reference.ConfigReference;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Basic Connector with @ConfigReference
 */
@Extension(name = "ConfigRefAMQP")
@Operations({BasicOperations.class})
public class BasicExtension
{

    @ConfigReference(namespace = "ANYPOINT_MQ", name = "CONFIG")
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
