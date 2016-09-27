package org.mule.modules.basic;

import org.mule.modules.basic.model.SOSPojo;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
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
    public String operationWithString(@UseConfig BasicExtensionConfig config, String param, SOSPojo pojoParam, @Placement(tab = Placement.ADVANCED, group = "Advance Group") String advanceField, @Placement(tab = Placement.ADVANCED, group = "Advance Group") String advanceField2,
                                      @Placement(tab = Placement.ADVANCED, group = "Another Group") Integer advanceIntField)
    {
        return param;
    }

}
