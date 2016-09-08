package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class AdvanceOperations
{

    /**
     * Operation With String description
     *
     * @param config config description
     * @param param String param description
     */
    public String operationWithImportedPojo(@UseConfig AdvanceExtensionConfig config, ComplexPojo param)
    {
        return "";
    }

}
