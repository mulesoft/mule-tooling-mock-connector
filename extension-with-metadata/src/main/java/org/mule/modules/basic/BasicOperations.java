package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.metadata.Content;
import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Connection;

import java.util.List;
import java.util.Map;

public class BasicOperations
{

    /**
     * Operation With Map description
     *
     * @param connection config description
     * @param dynamicObject Dynamic Entity
     */
    @OutputResolver(TestInputAndOutputResolverWithKeyResolver.class)
    public Map<String, Object> createEntity(@Connection MetadataConnection connection, @MetadataKeyId String type,
                                            @Content @TypeResolver(TestInputAndOutputResolverWithKeyResolver.class) Map<String, Object> dynamicObject)
    {
        if (dynamicObject == null)
        {
            throw new RuntimeException("dynamicObjects cannot be null");
        }
        return dynamicObject;
    }

    @OutputResolver(TestInputAndOutputResolverWithKeyResolver.class)
    public List<Map<String, Object>> createBulk(@Connection MetadataConnection connection,  @MetadataKeyId String type,
                             @Content @TypeResolver(TestInputAndOutputResolverWithKeyResolver.class) List<Map<String, Object>> dynamicObjects)
    {
        if (dynamicObjects == null)
        {
            throw new RuntimeException("dynamicObjects cannot be null");
        }
        return dynamicObjects;
    }
}
