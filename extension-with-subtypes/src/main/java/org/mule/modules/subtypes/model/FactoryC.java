package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@XmlHints(allowTopLevelDefinition = true)
public final class FactoryC implements IFactory
{
    @Parameter
    @Optional
    private String paramaterC;
}
