package org.mule.metadata.extension;

import org.mule.runtime.api.message.Attributes;

public class StringAttributes implements Attributes
{

    private String value;

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

}
