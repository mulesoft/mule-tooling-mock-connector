package org.mule.modules.basic;

import static org.mule.runtime.extension.api.annotation.param.MediaType.TEXT_PLAIN;
import org.mule.modules.basic.route.MyStereotypeForOnlyProcessors;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.stereotype.Stereotype;

@Stereotype(MyStereotypeForOnlyProcessors.class)
public class StereotypedOperations
{
    @MediaType(TEXT_PLAIN)
    public String echo(String message)
    {
        return message;
    }
}
