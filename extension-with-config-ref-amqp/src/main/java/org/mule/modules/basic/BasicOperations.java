package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.reference.ConfigReference;

public class BasicOperations
{

    /**
     * Operation with config ref parameter
     *
     * @return
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithConfigRef(@ConfigReference(namespace = "ANYPOINT_MQ", name = "CONFIG") String configRefAtOperation, PojoWithRef pojo)
    {
        return "";
    }

}
