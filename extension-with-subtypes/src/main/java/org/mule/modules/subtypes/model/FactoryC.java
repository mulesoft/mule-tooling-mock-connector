package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@TypeDsl(allowTopLevelDefinition = true)
public class FactoryC implements IFactory
{
    @Parameter
    @Optional
    private String paramaterC;

    public String getParamaterC()
    {
        return paramaterC;
    }

    public void setParamaterC(String paramaterC)
    {
        this.paramaterC = paramaterC;
    }
}
