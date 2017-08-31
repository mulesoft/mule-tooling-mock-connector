package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ SubtypesOperations.class })
public class SubtypesExtensionConfig
{

    @Parameter
    private BasePojo basePojo;

}
