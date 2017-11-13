package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;

@TypeDsl(allowTopLevelDefinition = true)
public class FactoryA implements IFactory
{
    @Parameter
    private String paramaterA;

    public String getParamaterA()
    {
        return paramaterA;
    }

    public void setParamaterA(String paramaterA)
    {
        this.paramaterA = paramaterA;
    }
}
