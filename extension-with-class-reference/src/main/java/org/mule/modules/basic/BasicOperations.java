package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.display.ClassValue;

public class BasicOperations
{

    /**
     * Operation with class reference
     */

    public void operationWithClassReference(@ClassValue(extendsOrImplements = "org.mule.modules.basic.MyInterface") String myInterfaceName, PojoWithClassReference pojo)
    {

    }

}
