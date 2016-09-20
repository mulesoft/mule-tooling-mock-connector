package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * Connection Provider description
 */
@DisplayName("BASIC Provider")
public class BasicConnectionProvider implements ConnectionProvider<DummyConnection>
{

    /**
     * Provider parameter description
     */
    @Parameter
    @DisplayName("Foo Provider Parameter")
    private String providerParameter;

    @Override
    public DummyConnection connect() throws ConnectionException
    {
        return null;
    }

    @Override
    public void disconnect(DummyConnection connection)
    {

    }

    @Override
    public ConnectionValidationResult validate(DummyConnection connection)
    {
        return null;
    }

    public String getProviderParameter()
    {
        return providerParameter;
    }

    public void setProviderParameter(String providerParameter)
    {
        this.providerParameter = providerParameter;
    }
}
