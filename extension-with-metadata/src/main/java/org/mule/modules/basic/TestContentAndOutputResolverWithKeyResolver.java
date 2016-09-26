package org.mule.modules.basic;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataKey;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.MetadataContentResolver;
import org.mule.runtime.api.metadata.resolving.MetadataKeysResolver;
import org.mule.runtime.api.metadata.resolving.MetadataOutputResolver;

import java.util.Set;

public class TestContentAndOutputResolverWithKeyResolver
    implements MetadataKeysResolver, MetadataContentResolver<String>, MetadataOutputResolver<String>
{

  @Override
  public Set<MetadataKey> getMetadataKeys(MetadataContext context) throws MetadataResolvingException, ConnectionException
  {
    return TestMetadataResolverUtils.getKeys(context);
  }

  @Override
  public MetadataType getContentMetadata(MetadataContext context, String key) throws MetadataResolvingException {
    return TestMetadataResolverUtils.getMetadata(key);
  }

  @Override
  public MetadataType getOutputMetadata(MetadataContext context, String key) throws MetadataResolvingException {
    return TestMetadataResolverUtils.getMetadata(key);
  }

  @Override
  public String getCategoryName()
  {
    return "BasicCategory";
  }
}
