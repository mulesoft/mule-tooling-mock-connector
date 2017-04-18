package org.mule.modules.basic;

import static org.mule.modules.basic.MyErrors.BAD_REQUEST;
import static org.mule.modules.basic.MyErrors.BAD_RESPONSE;
import org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider;
import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class AllErrorTypeProvider implements ErrorTypeProvider
{

    @Override
    public Set<ErrorTypeDefinition> getErrorTypes()
    {
        return ImmutableSet.<ErrorTypeDefinition>builder()
                .add(BAD_REQUEST)
                .add(BAD_RESPONSE)
                .build();
    }
}