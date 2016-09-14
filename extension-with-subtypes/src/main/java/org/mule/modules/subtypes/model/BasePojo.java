package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public abstract class BasePojo
{
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
