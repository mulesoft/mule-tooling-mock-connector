package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.IFactory;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.List;

public class SubtypesOperations
{

    /**
     * Operation With String description
     */
    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationBaseTypeList(@Config SubtypesExtensionConfig config, List<BasePojo> pojos)
    {
        return "";
    }

    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithBookList(@Config SubtypesExtensionConfig config, List<Book> books)
    {
        return "";
    }

    @MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
    public String operationWithInterfaceList(@Config SubtypesExtensionConfig config, List<IFactory> factories)
    {
        return "";
    }

}
