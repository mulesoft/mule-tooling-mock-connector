package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataKey;
import org.mule.runtime.api.metadata.MetadataKeyBuilder;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.TypeKeysResolver;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * Created by pablocabrera on 7/12/18.
 */
public class ConfigurableKeysTypeResolver implements TypeKeysResolver {

    @Override public Set<MetadataKey> getKeys(MetadataContext metadataContext) throws MetadataResolvingException, ConnectionException {
        Optional<BasicExtensionConfig> config = metadataContext.getConfig();
        int size = 100;
        if (config.isPresent()) {
            size = config.get().getKeySetSize();
        }

        Set<MetadataKey> keySet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            String prefix = UUID.randomUUID().toString().substring(0, 5);
            keySet.add(MetadataKeyBuilder.newKey("id" + i + prefix).withDisplayName(prefix + i).build());
        }
        return null;
    }

    @Override public String getCategoryName() {
        return "ConfigurableKeySet";
    }
}
