package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.List;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class SubtypesExtensionConfig
{

    @Parameter
    private List<BasePojo> basePojos;

}
