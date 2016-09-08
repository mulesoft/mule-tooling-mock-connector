package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.IFactory;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class SubtypesOperations
{

    /**
     * Operation With String description
     */
    public String operationBaseType(@UseConfig SubtypesExtensionConfig config, BasePojo pojo)
    {
        return "";
    }

    public String operationWithBook(@UseConfig SubtypesExtensionConfig config, Book bookParam)
    {
        return "";
    }

    public String operationWithInterface(@UseConfig SubtypesExtensionConfig config, IFactory factoryParam)
    {
        return "";
    }
}
