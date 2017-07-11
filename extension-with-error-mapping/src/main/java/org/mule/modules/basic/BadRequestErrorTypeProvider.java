package org.mule.modules.basic;

import static org.mule.modules.basic.MyErrors.BAD_REQUEST;
import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.Collections;
import java.util.Set;

public class BadRequestErrorTypeProvider implements ErrorTypeProvider
{

    @Override
    public Set<ErrorTypeDefinition> getErrorTypes()
    {
        return Collections.singleton(BAD_REQUEST);
    }
}
