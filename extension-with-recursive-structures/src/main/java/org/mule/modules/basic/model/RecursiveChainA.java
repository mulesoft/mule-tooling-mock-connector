package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

import java.util.List;

@XmlHints(allowTopLevelDefinition = true)
public class RecursiveChainA
{
    @Parameter
    private String fieldA;

    @Parameter
    private RecursiveChainB chainB;

    @Parameter
    private List<RecursiveChainB> bChains;

    public String getFieldA()
    {
        return fieldA;
    }

    public RecursiveChainB getChainB()
    {
        return chainB;
    }

    public List<RecursiveChainB> getbChains()
    {
        return bChains;
    }
}

