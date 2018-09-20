package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param config The extension config
     * @param body Mock Content
     * @param body Mock Content
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String mockOperation(@Config BasicExtensionConfig config, @ParameterGroup(name = "Pojo Key") @MetadataKeyId(PojoKeyTypeResolver.class) PojoKey key, @Content Object body)
    {
        return "";
    }

    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String mockOperationWithKeys(@Config BasicExtensionConfig config, @MetadataKeyId(ConfigurableKeysTypeResolver.class) String key, @Content Object body)
    {
        return "";
    }

}
