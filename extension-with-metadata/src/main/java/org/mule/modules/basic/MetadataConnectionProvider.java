package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;

public class MetadataConnectionProvider implements ConnectionProvider<MetadataConnection> {

  @Override
  public MetadataConnection connect() throws ConnectionException {
    return new MetadataConnection();
  }

  @Override
  public void disconnect(MetadataConnection metadataConnection) {

  }

  @Override
  public ConnectionValidationResult validate(MetadataConnection metadataConnection) {
    return ConnectionValidationResult.success();
  }
}
