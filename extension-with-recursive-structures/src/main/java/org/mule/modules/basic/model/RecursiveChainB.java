package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public class RecursiveChainB
{
    @Parameter
    String fieldB;

    //@Parameter
    //RecursiveChainA chainA;

    //@Parameter
    //List<RecursiveChainA> aChains;
}
