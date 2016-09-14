package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.metadata.Content;
import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.MetadataScope;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Optional;

import java.util.List;
import java.util.Map;

@MetadataScope(keysResolver = TestContentAndOutputResolverWithKeyResolver.class,
        contentResolver = TestContentAndOutputResolverWithKeyResolver.class,
        outputResolver = TestContentAndOutputResolverWithKeyResolver.class)
public class BasicOperations
{

    /**
     * Operation With Map description
     *
     * @param connection config description
     * @param dynamicObject Dynamic Entity
     */
    public Map<String, Object> createEntity(@Connection MetadataConnection connection, @MetadataKeyId String type,
                                            @Optional @Content Map<String, Object> dynamicObject)
    {
        if (dynamicObject == null)
        {
            throw new RuntimeException("dynamicObjects cannot be null");
        }
        return dynamicObject;
    }

    public List<Map<String, Object>> createBulk(@Connection MetadataConnection connection,  @MetadataKeyId String type,
                             @Optional @Content List<Map<String, Object>> dynamicObjects)
    {
        if (dynamicObjects == null)
        {
            throw new RuntimeException("dynamicObjects cannot be null");
        }
        return dynamicObjects;
    }
}
