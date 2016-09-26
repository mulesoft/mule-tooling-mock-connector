package org.mule.modules.basic.model;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.ParameterGroup;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public class ContainerPojo
{
    @Parameter
    private String simpleField;

    @ParameterGroup
    private SOSPojo groupedFields;
}
