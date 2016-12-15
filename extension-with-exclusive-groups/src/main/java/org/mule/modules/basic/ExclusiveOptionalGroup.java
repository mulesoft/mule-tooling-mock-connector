package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.ExclusiveOptionals;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@ExclusiveOptionals
public class ExclusiveOptionalGroup
{

    @Parameter
    @Optional
    private String advanceField;

    @Parameter
    @Optional
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
