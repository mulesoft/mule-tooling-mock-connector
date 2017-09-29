package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;

@TypeDsl(allowTopLevelDefinition = true)
public class FactoryB implements IFactory
{
    @Parameter
    private String paramaterB;

    public String getParamaterB()
    {
        return paramaterB;
    }

    public void setParamaterB(String paramaterB)
    {
        this.paramaterB = paramaterB;
    }
}
