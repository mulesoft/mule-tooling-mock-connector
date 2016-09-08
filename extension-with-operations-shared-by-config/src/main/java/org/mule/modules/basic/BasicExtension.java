package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;

/**
 * Extension javadoc description
 */
@Extension(name = "OperationsSharedByConfigAndSources", description = "Basic Connector Description")
@Configurations({BasicExtensionConfig.class, SourceAndOperationsBasicExtensionConfig.class})
public class BasicExtension
{

}