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
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithObjectStoreRef(@ObjectStoreReference String objectStoreRefAtOperation, PojoWithRef pojo)
    {
        return "";
    }

}
