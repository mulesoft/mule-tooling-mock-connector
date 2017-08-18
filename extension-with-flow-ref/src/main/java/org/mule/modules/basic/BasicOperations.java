package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.reference.FlowReference;

public class BasicOperations
{

    /**
     * Operation with a flow reference
     *
     * @return
     */
    public String operationWithFlowRef(@FlowReference String flowRefAtOperation, PojoWithRef pojo)
    {
        return "";
    }

}
