package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations
{

    @MediaType(MediaType.APPLICATION_PLAIN)
    public String dummyOperation(String param)
    {
        return null;
    }

}
