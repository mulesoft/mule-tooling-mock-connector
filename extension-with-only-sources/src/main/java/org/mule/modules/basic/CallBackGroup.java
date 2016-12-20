package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Created by pablocabrera on 12/20/16.
 */
public class CallBackGroup
{

    @Parameter
    private String message;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
