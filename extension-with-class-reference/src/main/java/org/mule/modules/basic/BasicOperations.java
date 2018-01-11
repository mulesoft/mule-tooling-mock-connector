package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.display.ClassValue;

public class BasicOperations
{

    /**
     * Operation with class reference
     */
    public void operationWithClassReference(@ClassValue(extendsOrImplements = "org.mule.modules.basic.MyInterface") String myInterfaceName,
                                            @Optional @Expression(ExpressionSupport.NOT_SUPPORTED) PojoWithClassReference pojo)
    {
        try
        {
            Class.forName(myInterfaceName).newInstance();
        }
        catch (InstantiationException|IllegalAccessException|ClassNotFoundException e)
        {
            throw new RuntimeException(e.getClass().getName());
        }
    }

}
