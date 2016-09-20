package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

@XmlHints(allowTopLevelDefinition = true)
@DisplayName("Save me Pojo")
@Alias("sos-pojo")
public class SOSPojo
{
    private double amount;
    private String type;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
}
