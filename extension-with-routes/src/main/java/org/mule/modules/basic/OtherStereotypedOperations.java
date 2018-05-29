package org.mule.modules.basic;

import static org.mule.runtime.extension.api.annotation.param.MediaType.TEXT_PLAIN;
import org.mule.modules.basic.route.AnotherStereotype;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.stereotype.Stereotype;

@Stereotype(AnotherStereotype.class)
public class OtherStereotypedOperations
{
    @MediaType(TEXT_PLAIN)
    public String echo2(String message)
    {
        return message;
    }
}
