package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.IFactory;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.util.List;

public class SubtypesOperations
{

    /**
     * Operation With String description
     */
    public String operationBaseTypeList(@UseConfig SubtypesExtensionConfig config, List<BasePojo> pojos)
    {
        return "";
    }

    public String operationWithBookList(@UseConfig SubtypesExtensionConfig config, List<Book> books)
    {
        return "";
    }

    public String operationWithInterfaceList(@UseConfig SubtypesExtensionConfig config, List<IFactory> factories)
    {
        return "";
    }

}
