package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Created by pablocabrera on 12/20/16.
 */
public class ErrorCallBackGroup
{

    @Parameter
    private String message;

    @Parameter
    private String details;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getDetails()
    {
        return details;
    }

    public void setDetails(String details)
    {
        this.details = details;
    }
}
