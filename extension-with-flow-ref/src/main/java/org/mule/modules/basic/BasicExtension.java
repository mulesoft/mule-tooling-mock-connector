package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.param.reference.FlowReference ;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Basic Connector with @FlowReference
 */
@Extension(name = "FlowRef")
@Operations({BasicOperations.class})
public class BasicExtension
{

    @FlowReference
    @Parameter
    private String flowRefAtConfig;

    public String getFlowRefAtConfig()
    {
        return flowRefAtConfig;
    }

    public void setFlowRefAtConfig(String flowRefAtConfig)
    {
        this.flowRefAtConfig = flowRefAtConfig;
    }
}
