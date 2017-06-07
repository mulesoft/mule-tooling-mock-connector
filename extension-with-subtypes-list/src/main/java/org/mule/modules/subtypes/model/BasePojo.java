package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;

public abstract class BasePojo
{
    @Parameter
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
