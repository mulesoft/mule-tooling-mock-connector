package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations
{

    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String dummyOperation(String param)
    {
        return null;
    }

}
