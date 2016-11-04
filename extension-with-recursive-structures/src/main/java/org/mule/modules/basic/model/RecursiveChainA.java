package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

import java.util.List;

@XmlHints(allowTopLevelDefinition = true)
public class RecursiveChainA
{
    @Parameter
    String fieldA;

    @Parameter
    RecursiveChainB chainB;

    @Parameter
    List<RecursiveChainB> bChains;
}
