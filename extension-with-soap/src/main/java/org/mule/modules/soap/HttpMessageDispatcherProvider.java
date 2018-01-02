package org.mule.modules.soap;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.soap.MessageDispatcherProvider;

public class HttpMessageDispatcherProvider implements MessageDispatcherProvider<HttpMessageDispatcher>
{
    @Override public HttpMessageDispatcher connect() throws ConnectionException
    {
        return null;
    }

    @Override public void disconnect(HttpMessageDispatcher o)
    {

    }

    @Override public ConnectionValidationResult validate(HttpMessageDispatcher o)
    {
        return null;
    }
}
