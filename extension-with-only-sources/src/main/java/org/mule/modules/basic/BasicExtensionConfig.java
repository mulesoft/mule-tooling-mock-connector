package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Sources({BasicSource.class, AnotherSource.class})
public class BasicExtensionConfig
{

    /**
     * Config Parameter description
     */
    @Parameter
    private String configParameter;

}
