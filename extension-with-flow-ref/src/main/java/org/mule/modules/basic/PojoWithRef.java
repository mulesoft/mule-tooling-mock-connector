package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.reference.FlowReference;

public class PojoWithRef
{

    @FlowReference
    @Parameter
    @Optional
    private String flowRefAtPojo;

    public String getFlowRefAtPojo()
    {
        return flowRefAtPojo;
    }

    public void setFlowRefAtPojo(String flowRefAtPojo)
    {
        this.flowRefAtPojo = flowRefAtPojo;
    }
}
