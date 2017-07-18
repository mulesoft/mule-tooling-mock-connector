package org.mule.modules.basic;

import java.io.Serializable;

public class BasicAttributes implements Serializable
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
