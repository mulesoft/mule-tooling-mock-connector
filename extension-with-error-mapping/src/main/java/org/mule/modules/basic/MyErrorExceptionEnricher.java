package org.mule.modules.basic;

import org.mule.runtime.extension.api.exception.ModuleException;
import org.mule.runtime.extension.api.runtime.exception.ExceptionEnricher;

public class MyErrorExceptionEnricher implements ExceptionEnricher
{

    @Override
    public Exception enrichException(Exception e)
    {
        if (e instanceof CustomException)
        {
            return new ModuleException(e, ((CustomException) e).getType(), "Ups: " + e.getMessage());
        }
        return e;
    }
}
