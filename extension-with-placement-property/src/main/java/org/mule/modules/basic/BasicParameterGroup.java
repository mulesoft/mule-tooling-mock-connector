package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Created by pablocabrera on 11/29/16.
 */
public class BasicParameterGroup
{

    @Parameter
    private String advanceField;

    @Parameter
    private String advanceField2;

    public String getAdvanceField()
    {
        return advanceField;
    }

    public void setAdvanceField(String advanceField)
    {
        this.advanceField = advanceField;
    }

    public String getAdvanceField2()
    {
        return advanceField2;
    }

    public void setAdvanceField2(String advanceField2)
    {
        this.advanceField2 = advanceField2;
    }

}
