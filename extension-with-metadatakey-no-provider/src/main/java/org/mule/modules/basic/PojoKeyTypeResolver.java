package org.mule.modules.basic;

import static java.util.Collections.emptySet;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataKey;
import org.mule.runtime.api.metadata.MetadataKeyBuilder;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.PartialTypeKeysResolver;

import java.util.Set;

public class PojoKeyTypeResolver implements PartialTypeKeysResolver<PojoKey>
{
    @Override public MetadataKey resolveChilds(MetadataContext metadataContext, PojoKey pojoKey) throws MetadataResolvingException, ConnectionException
    {
        String filter = pojoKey.getFilter();
        MetadataKeyBuilder key = MetadataKeyBuilder.newKey(filter);
        int totalKeys = 100;
        try
        {
            totalKeys = Integer.valueOf(filter);
        }
        catch (NumberFormatException ex)
        {
            //ignore errors
        }
        for (int i = 0; i < totalKeys; i++)
        {
            key.withChild(MetadataKeyBuilder.newKey(pojoKey.getFilter() + i).build());
        }
        return key.build();
    }

    @Override public Set<MetadataKey> getKeys(MetadataContext metadataContext) throws MetadataResolvingException, ConnectionException
    {

        return emptySet();
    }

    @Override public String getCategoryName()
    {
        return "PojoKeyCategory";
    }
}
