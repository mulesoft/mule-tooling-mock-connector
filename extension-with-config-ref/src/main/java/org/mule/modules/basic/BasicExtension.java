package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.reference.ConfigReference;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Extension javadoc description
 */
@Extension(name = "ConfigRef", description = "Basic Connector with @ConfigReference")
@Operations({BasicOperations.class})
public class BasicExtension
{

    @ConfigReference(name = "http",namespace = "requesterConfig")
    @Parameter
    String requesterConfig;

}
