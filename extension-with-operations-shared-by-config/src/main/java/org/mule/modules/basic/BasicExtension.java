package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;

/**
 * Basic Connector Description
 */
@Extension(name = "OperationsSharedByConfigAndSources")
@Configurations({BasicExtensionConfig.class, SourceAndOperationsBasicExtensionConfig.class})
public class BasicExtension
{

}