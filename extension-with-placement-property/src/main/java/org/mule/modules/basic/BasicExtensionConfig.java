package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.param.display.Placement;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({BasicOperations.class})
@Sources({BasicSource.class})
public class BasicExtensionConfig
{

    /**
     * Config Parameter description
     */
    @Parameter
    @Placement(order = 2)
    private String configParameter;

    /**
     * Config Parameter description
     */
    @Parameter
    private String anotherParameter;
}
