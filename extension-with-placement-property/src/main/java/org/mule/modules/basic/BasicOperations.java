package org.mule.modules.basic;

import org.mule.modules.basic.model.SOSPojo;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

public class BasicOperations
{

    /**
     * Operation With String description
     *
     * @param config config description
     * @param param  String param description
     */
    @DisplayName("Custom operation label")
    @MediaType(MediaType.APPLICATION_PLAIN)
    public String operationWithString(@Config BasicExtensionConfig config, String param, SOSPojo pojoParam, @Placement(tab = Placement.ADVANCED_TAB) @ParameterGroup(name = "Advance Group") BasicParameterGroup basicGroup,
                                      @Placement(tab = Placement.ADVANCED_TAB) @ParameterGroup(name = "Another Group") AnotherParameterGroup anotherGroup)
    {
        return param;
    }

}
