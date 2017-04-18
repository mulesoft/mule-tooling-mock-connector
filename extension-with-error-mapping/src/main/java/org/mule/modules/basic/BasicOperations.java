package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.OnException;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.param.Config;

public class BasicOperations
{

    /**
     * Operation With String description
     */
    @OnException(MyErrorExceptionHandler.class)
    @Throws(BadRequestErrorTypeProvider.class)
    public String operationBarRequest(@Config BasicExtensionConfig config, String stringParam) throws CustomException
    {
        return "";
    }

    @OnException(MyErrorExceptionHandler.class)
    @Throws(BadResponseErrorTypeProvider.class)
    public String operationBarResponse(@Config BasicExtensionConfig config, String stringParam) throws CustomException
    {
        return "";
    }

    @OnException(MyErrorExceptionHandler.class)
    @Throws(AllErrorTypeProvider.class)
    public String operationAllErrors(@Config BasicExtensionConfig config, String stringParam) throws CustomException
    {
        return "";
    }

}
