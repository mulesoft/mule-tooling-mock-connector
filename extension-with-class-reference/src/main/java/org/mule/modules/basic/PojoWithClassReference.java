package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.ClassValue;

public class PojoWithClassReference
{

    @ClassValue(extendsOrImplements = "org.mule.modules.basic.MyAbstractClass")
    @Parameter
    private String myAbstractClassParameter;


    public String getMyAbstractClassParameter()
    {
        return myAbstractClassParameter;
    }

    public void setMyAbstractClassParameter(String myAbstractClassParameter)
    {
        this.myAbstractClassParameter = myAbstractClassParameter;
    }
}
