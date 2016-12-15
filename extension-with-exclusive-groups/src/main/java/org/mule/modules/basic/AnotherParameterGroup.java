package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Created by pablocabrera on 11/29/16.
 */
public class AnotherParameterGroup
{
    @Parameter
    private Integer advanceIntField;

    public Integer getAdvanceIntField()
    {
        return advanceIntField;
    }

    public void setAdvanceIntField(Integer advanceIntField)
    {
        this.advanceIntField = advanceIntField;
    }
}
