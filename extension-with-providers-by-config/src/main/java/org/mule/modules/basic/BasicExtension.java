package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Basic Connector Description
 */
@Extension(name = "ProvidersByConfig")
@Configurations({BasicExtensionConfig.class, AnotherBasicExtensionConfig.class})
@ConnectionProviders({BasicConnectionProvider.class})
@Operations({SharedOperations.class})
public class BasicExtension
{

}