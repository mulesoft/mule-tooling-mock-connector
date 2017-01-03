package org.mule.modules.basic.model;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public class ContainerPojo
{
    @Parameter
    private String simpleField;

    @ParameterGroup(name="SOSPojo")
    private SOSPojo groupedFields;

    public String getSimpleField()
    {
        return simpleField;
    }

    public SOSPojo getGroupedFields()
    {
        return groupedFields;
    }
}
