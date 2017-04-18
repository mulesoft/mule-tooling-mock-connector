package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.runtime.extension.api.annotation.param.Config;

public class AdvanceOperations
{

    /**
     * Operation With String description
     *
     * @param config config description
     * @param param String param description
     */
    public String operationWithImportedPojo(@Config AdvanceExtensionConfig config, ComplexPojo param)
    {
        return "";
    }

}
