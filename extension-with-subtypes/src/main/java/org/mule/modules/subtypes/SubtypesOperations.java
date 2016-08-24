package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.IFactory;

public class SubtypesOperations
{

    /**
     * Operation With String description
     */
    public String operationBaseType(BasePojo pojo)
    {
        return "";
    }

    public String operationWithBook(Book bookParam)
    {
        return "";
    }

    public String operationWithInterface(IFactory factoryParam)
    {
        return "";
    }
}
