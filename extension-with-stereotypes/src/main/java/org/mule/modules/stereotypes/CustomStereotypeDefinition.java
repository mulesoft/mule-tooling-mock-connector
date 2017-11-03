package org.mule.modules.stereotypes;

import org.mule.runtime.extension.api.stereotype.StereotypeDefinition;


public class CustomStereotypeDefinition implements StereotypeDefinition
{
    public String getNamespace()
    {
        return "STEREOTYPES";
    }

    @Override public String getName()
    {
        return "CUSTOM_STEREOTYPE";
    }
}
