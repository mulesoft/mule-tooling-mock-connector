package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExternalLibraryType;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.ExternalLib;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({BasicOperations.class})
@ExternalLib(name = "FooDriver", requiredClassName = "org.mule.modules.FooDriver", type = ExternalLibraryType.JAR)
@ExternalLib(
        name = "JCo Native Library",
        description = "JCo Native Library that depends on the OS",
        type = ExternalLibraryType.NATIVE,
        nameRegexpMatcher = "mock-native-lib.*\\.war"
)
public class BasicExtensionConfig
{

    /**
     * Config Parameter description
     */
    @Parameter
    private String configParameter;

}
