package org.mule.modules.basic;

import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.Optional;

public enum MyErrors implements ErrorTypeDefinition<MyErrors>
{
    /**
     * Error thrown when the generated request is invalid, mostly because inconsistent provided parameters.
     */
    BAD_REQUEST("Bad Request"),

    /**
     * Error thrown when the resulting response is invalid.
     */
    BAD_RESPONSE("Bad Response");

    private final String type;

    MyErrors(String type)
    {
        this.type = type;
    }

    @Override
    public String getType()
    {
        return type;
    }

    @Override
    public Optional<ErrorTypeDefinition<? extends Enum<?>>> getParent()
    {
        return Optional.empty();
    }
}