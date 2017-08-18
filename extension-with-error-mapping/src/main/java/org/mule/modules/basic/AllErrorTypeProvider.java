package org.mule.modules.basic;

import static org.mule.modules.basic.MyErrors.BAD_REQUEST;
import static org.mule.modules.basic.MyErrors.BAD_RESPONSE;
import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllErrorTypeProvider implements ErrorTypeProvider
{

    @Override
    public Set<ErrorTypeDefinition> getErrorTypes()
    {
        return new HashSet<>(Arrays.asList(BAD_REQUEST, BAD_RESPONSE));
    }
}
