package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;

public class SOSPojo
{
    @Parameter
    private double amount;

    @Parameter
    private String type;

    public double getAmount()
    {
        return amount;
    }

    public String getType()
    {
        return type;
    }
}
