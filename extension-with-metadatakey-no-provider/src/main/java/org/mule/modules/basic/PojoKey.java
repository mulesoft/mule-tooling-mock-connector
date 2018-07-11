package org.mule.modules.basic;

import static org.mule.runtime.api.meta.ExpressionSupport.NOT_SUPPORTED;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyPart;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class PojoKey
{
    @Parameter
    @Expression(NOT_SUPPORTED)
    @MetadataKeyPart(order = 1, providedByKeyResolver = false)
    private String filter;

    @Parameter
    @MetadataKeyPart(order = 2)
    private String type;

    public String getFilter()
    {
        return filter;
    }

    public void setFilter(String filter)
    {
        this.filter = filter;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
