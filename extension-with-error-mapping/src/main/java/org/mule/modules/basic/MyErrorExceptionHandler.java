package org.mule.modules.basic;

import org.mule.runtime.extension.api.exception.ModuleException;
import org.mule.runtime.extension.api.runtime.exception.ExceptionHandler;

public class MyErrorExceptionHandler extends ExceptionHandler
{

    @Override
    public Exception enrichException(Exception e)
    {
        if (e instanceof CustomException)
        {
            return new ModuleException("Ups: " + e.getMessage(), ((CustomException) e).getType(), e);
        }
        return e;
    }
}
