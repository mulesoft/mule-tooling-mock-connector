package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

/**
 * Config javadoc description
 */
@DisplayName("BASIC Config")
@Configuration(name = "config", description = "Config Description")
@Operations({BasicOperations.class})
@Sources({BasicSource.class})
public class BasicExtensionConfig
{

    /**
     * Config Parameter description
     */
    @Parameter
    @DisplayName("Foo Config Parameter")
    private String configParameter;

}
