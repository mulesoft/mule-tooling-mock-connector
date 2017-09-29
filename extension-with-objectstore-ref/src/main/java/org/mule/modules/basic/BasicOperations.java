package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.reference.ObjectStoreReference;

public class BasicOperations
{

    /**
     * Operation with a flow reference
     *
     * @return
     */
    @MediaType(MediaType.APPLICATION_PLAIN)
    public String operationWithObjectStoreRef(@ObjectStoreReference String objectStoreRefAtOperation, PojoWithRef pojo)
    {
        return "";
    }

}
