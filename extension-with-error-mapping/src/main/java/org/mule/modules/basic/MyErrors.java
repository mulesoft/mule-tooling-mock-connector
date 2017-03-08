package org.mule.modules.basic;

import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.Optional;

public enum MyErrors implements ErrorTypeDefinition<MyErrors>
{
    /**
     * Error thrown when the generated request is invalid, mostly because inconsistent provided parameters.
     */
    BAD_REQUEST,

    /**
     * Error thrown when the resulting response is invalid.
     */
    BAD_RESPONSE;


    @Override
    public Optional<ErrorTypeDefinition<? extends Enum<?>>> getParent()
    {
        return Optional.empty();
    }
}