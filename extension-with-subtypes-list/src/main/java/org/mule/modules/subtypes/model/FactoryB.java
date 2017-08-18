package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;

@TypeDsl(allowTopLevelDefinition = true)
public class FactoryB implements IFactory
{

    public String getParameterB()
    {
        return parameterB;
    }

    public void setParameterB(String parameterB)
    {
        this.parameterB = parameterB;
    }

    @Parameter
    private String parameterB;
}
