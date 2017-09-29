package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.FactoryC;
import org.mule.modules.subtypes.model.IFactory;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.NullSafe;
import org.mule.runtime.extension.api.annotation.param.Optional;

public class SubtypesOperations
{

    /**
     * Operation With String description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationBaseType(@Config SubtypesExtensionConfig config, BasePojo pojo)
    {
        return "";
    }

    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithBook(@Config SubtypesExtensionConfig config, Book bookParam)
    {
        return "";
    }

    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithInterface(@Config SubtypesExtensionConfig config, @Optional @NullSafe(defaultImplementingType = FactoryC.class) IFactory factoryParam)
    {
        return "";
    }
}
