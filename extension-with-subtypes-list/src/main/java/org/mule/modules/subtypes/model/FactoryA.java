package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public final class FactoryA implements IFactory
{

    public String getParameterA()
    {
        return parameterA;
    }

    public void setParameterA(String parameterA)
    {
        this.parameterA = parameterA;
    }

    @Parameter
    private String parameterA;
}
