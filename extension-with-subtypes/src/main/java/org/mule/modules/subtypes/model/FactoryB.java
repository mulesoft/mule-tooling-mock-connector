package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public class FactoryB implements IFactory
{
    @Parameter
    private String paramaterB;
}
