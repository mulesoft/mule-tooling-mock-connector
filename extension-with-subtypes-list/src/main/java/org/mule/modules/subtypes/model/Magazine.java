package org.mule.modules.subtypes.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@XmlHints(allowTopLevelDefinition = true)
public class Magazine  extends BasePojo
{
    @Parameter
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
