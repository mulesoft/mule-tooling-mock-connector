package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.reference.ConfigReference;

public class BasicOperations
{

    /**
     * Operation with config ref parameter
     *
     * @return
     */
    public String operationWithConfigRef(@ConfigReference(name = "http",namespace = "requesterConfig") String configRefAtOperation)
    {
        return "";
    }

}
