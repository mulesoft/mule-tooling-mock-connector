package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.Parameter;

@Alias("source-connection")
public class SourceConnectionProvider implements ConnectionProvider<DummyConnection>
{

    /**
     * Provider parameter description
     */
    @Parameter
    private String sourceProviderParameter;

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
    public ConnectionValidationResult validate(DummyConnection dummyConnection)
    {
        return ConnectionValidationResult.success();
    }

}
