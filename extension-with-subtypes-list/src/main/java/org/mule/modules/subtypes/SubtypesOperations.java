package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.IFactory;

import java.util.List;

public class SubtypesOperations
{

    /**
     * Operation With String description
     */
    public String operationBaseTypeList(List<BasePojo> pojos)
    {
        return "";
    }

    public String operationWithBookList(List<Book> books)
    {
        return "";
    }

    public String operationWithInterfaceList(List<IFactory> factories)
    {
        return "";
    }

}
