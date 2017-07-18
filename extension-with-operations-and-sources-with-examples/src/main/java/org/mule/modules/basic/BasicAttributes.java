package org.mule.modules.basic;

import java.io.Serializable;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Example;

public class BasicAttributes implements Serializable
{
    @Parameter
    private String username;

    public String getUsername()
    {
        return username;
    }
}
