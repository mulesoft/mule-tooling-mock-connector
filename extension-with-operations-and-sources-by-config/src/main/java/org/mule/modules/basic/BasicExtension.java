package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;

/**
 * Basic Connector Description
 */
@Extension(name = "SourceAndOperationByConfig")
@Configurations({BasicExtensionConfig.class, SourceBasicExtensionConfig.class})
public class BasicExtension
{

}