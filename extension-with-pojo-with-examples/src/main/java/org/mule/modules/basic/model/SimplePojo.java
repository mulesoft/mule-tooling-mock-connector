package org.mule.modules.basic.model;

import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Example;

@TypeDsl(allowTopLevelDefinition = true)
public class SimplePojo {

    @Example("Type1")
    @Parameter
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
