package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.FlowReference;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Extension javadoc description
 */
@Extension(name = "FlowRef", description = "Basic Connector with @FlowReference")
@Operations({BasicOperations.class})
public class BasicExtension
{

    @FlowReference
    @Parameter
    String flowRefAtConfig;

}
