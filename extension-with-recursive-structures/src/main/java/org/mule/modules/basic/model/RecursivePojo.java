package org.mule.modules.basic.model;


import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

import java.util.List;
import java.util.Map;

@XmlHints(allowTopLevelDefinition = true)
public class RecursivePojo
{

    @Parameter
    private RecursivePojo next;

    @Parameter
    private List<RecursivePojo> childs;

    @Parameter
    private Map<String, RecursivePojo> mappedChilds;
}
