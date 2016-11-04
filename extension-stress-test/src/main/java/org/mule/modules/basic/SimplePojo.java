package org.mule.modules.basic;


import org.mule.runtime.extension.api.annotation.param.Parameter;

public class SimplePojo
{
    @Parameter
    private String stringField;

    public String getStringField()
    {
        return stringField;
    }
}
