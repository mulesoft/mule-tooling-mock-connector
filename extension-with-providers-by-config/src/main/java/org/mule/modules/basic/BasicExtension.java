package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connector.Providers;

/**
 * Extension javadoc description
 */
@Extension(name = "basic", description = "Basic Connector Description")
@Configurations({BasicExtensionConfig.class, AnotherBasicExtensionConfig.class})
@Providers({BasicConnectionProvider.class})
@Operations({SharedOperations.class})
public class BasicExtension
{

}