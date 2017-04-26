package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

/**
 * Created by pablocabrera on 11/29/16.
 */
public class AnotherParameterGroup
{
    //Fields with no order will be shown after the ones that have an order
    @Parameter
    private Integer noOrderField;

    //Since placement is highier, the field will be shown second
    @Parameter
    @Placement(order=3)
    private Integer advanceSecondField;

    @Parameter
    @Placement(order=1)
    private Integer advanceIntField;


    public Integer getAdvanceIntField()
    {
        return advanceIntField;
    }

    public void setAdvanceIntField(Integer advanceIntField)
    {
        this.advanceIntField = advanceIntField;
    }

    public Integer getNoOrderField()
    {
        return noOrderField;
    }

    public Integer getAdvanceSecondField()
    {
        return advanceSecondField;
    }
}
