package org.mule.modules.basic.route;

import static org.mule.runtime.extension.api.stereotype.MuleStereotypes.PROCESSOR_DEFINITION;
import org.mule.runtime.extension.api.stereotype.StereotypeDefinition;

import java.util.Optional;

public class MyStereotypeForOnlyProcessors implements StereotypeDefinition
{

    @Override
    public String getName()
    {
        return "MyStereotypeForOnlyProcessors";
    }

    @Override
    public Optional<StereotypeDefinition> getParent()
    {
        return Optional.of(PROCESSOR_DEFINITION);
    }

}