package org.mule.modules.basic;

import static java.util.Collections.emptySet;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataKey;
import org.mule.runtime.api.metadata.MetadataKeyBuilder;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.PartialTypeKeysResolver;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

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
        Optional<BasicExtensionConfig> config = metadataContext.getConfig();
        int size = 100;
        if (config.isPresent()) {
            size = config.get().getKeySetSize();
        }

        Set<MetadataKey> keySet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            String prefix = "MK";
            keySet.add(MetadataKeyBuilder.newKey("id" + i + prefix).withDisplayName(prefix + i).build());
        }
        return keySet;
    }

    @Override public String getCategoryName()
    {
        return "PojoKeyCategory";
    }
}
