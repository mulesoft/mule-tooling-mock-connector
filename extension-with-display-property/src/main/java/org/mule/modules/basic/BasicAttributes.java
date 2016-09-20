package org.mule.modules.basic;

import org.mule.runtime.api.message.Attributes;

public class BasicAttributes implements Attributes
{
    private String username;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
}
