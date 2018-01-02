package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Export;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.ClassValue;

/**
 * Basic Connector with @FlowReference
 */
@Extension(name = "ClassReference")
@Export(classes = {MyInterface.class, MyAbstractClass.class})
@Operations({BasicOperations.class})
public class BasicExtension
{
    @ClassValue(extendsOrImplements = "org.mule.modules.basic.MyInterface")
    @Parameter
    private String myInterfaceParameter;

    @ClassValue(extendsOrImplements = "org.mule.modules.basic.MyAbstractClass")
    @Parameter
    private String myAbstractClassParameter;

    public String getMyInterfaceParameter()
    {
        return myInterfaceParameter;
    }

    public void setMyInterfaceParameter(String myInterfaceParameter)
    {
        this.myInterfaceParameter = myInterfaceParameter;
    }

    public String getMyAbstractClassParameter()
    {
        return myAbstractClassParameter;
    }

    public void setMyAbstractClassParameter(String myAbstractClassParameter)
    {
        this.myAbstractClassParameter = myAbstractClassParameter;
    }
}
