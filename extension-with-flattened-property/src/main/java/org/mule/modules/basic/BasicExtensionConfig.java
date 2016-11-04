package org.mule.modules.basic;

import org.mule.modules.basic.model.ContainerPojo;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({BasicOperations.class})
public class BasicExtensionConfig
{

    /**
     * Config Parameter description
     */
    @Parameter
    private ContainerPojo configParameter;
}
