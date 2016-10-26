package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;
import org.mule.runtime.extension.api.annotation.param.display.Password;
import org.mule.runtime.extension.api.annotation.param.display.Text;

@XmlHints(allowTopLevelDefinition = true)
public class AnnotatedPojo
{
    @Parameter
    @Text
    private String content;

    @Parameter
    @Password
    private String password;

    public String getContent()
    {
        return content;
    }

    public String getPassword()
    {
        return password;
    }
}
