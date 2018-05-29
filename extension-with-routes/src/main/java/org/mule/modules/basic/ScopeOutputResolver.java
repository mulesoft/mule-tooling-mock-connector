package org.mule.modules.basic;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;

public class ScopeOutputResolver implements OutputTypeResolver {

  @Override
  public String getCategoryName() {
    return "Scope";
  }

  @Override
  public MetadataType getOutputType(MetadataContext context, Object key) throws MetadataResolvingException, ConnectionException {
    return context.getTypeBuilder().anyType().build();
  }
}
