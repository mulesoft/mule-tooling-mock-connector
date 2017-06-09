package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;

@XmlHints(allowTopLevelDefinition = true)
public class Magazine  extends BasePojo
{
    private Integer pages;

    public Integer getPages()
    {
        return pages;
    }

    public void setPages(Integer pages)
    {
        this.pages = pages;
    }
}
