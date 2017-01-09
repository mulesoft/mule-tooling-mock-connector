package org.mule.modules.basic;

import org.mule.runtime.api.message.Attributes;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Example;

public class BasicAttributes implements Attributes
{
    @Parameter
    private String username;

    public String getUsername()
    {
        return username;
    }
}
