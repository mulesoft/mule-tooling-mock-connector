package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.IFactory;
import org.mule.runtime.extension.api.annotation.param.Config;

public class SubtypesOperations
{

    /**
     * Operation With String description
     */
    public String operationBaseType(@Config SubtypesExtensionConfig config, BasePojo pojo)
    {
        return "";
    }

    public String operationWithBook(@Config SubtypesExtensionConfig config, Book bookParam)
    {
        return "";
    }

    public String operationWithInterface(@Config SubtypesExtensionConfig config, IFactory factoryParam)
    {
        return "";
    }
}
