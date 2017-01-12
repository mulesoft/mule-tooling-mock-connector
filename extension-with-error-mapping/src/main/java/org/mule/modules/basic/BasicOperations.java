package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.OnException;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class BasicOperations
{

    /**
     * Operation With String description
     */
    @OnException(MyErrorExceptionHandler.class)
    public String operationWithString(@UseConfig BasicExtensionConfig config, String stringParam) throws CustomException
    {
        return "";
    }

}
