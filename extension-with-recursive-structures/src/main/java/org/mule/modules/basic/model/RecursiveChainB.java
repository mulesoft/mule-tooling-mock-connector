package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;

import java.util.List;

@TypeDsl(allowTopLevelDefinition = true)
public class RecursiveChainB
{

    @Parameter
    private String fieldB;

    @Parameter
    private RecursiveChainA chainA;

    @Parameter
    private List<RecursiveChainA> aChains;


    public String getFieldB()
    {
        return fieldB;
    }

    public RecursiveChainA getChainA()
    {
        return chainA;
    }

    public List<RecursiveChainA> getaChains()
    {
        return aChains;
    }
}
