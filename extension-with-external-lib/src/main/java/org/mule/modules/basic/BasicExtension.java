package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * ExternalLib Connector Description
 */
@Extension(name = "ExternalLib")
@Configurations({BasicExtensionConfig.class})
@ConnectionProviders({BasicConnectionProvider.class, ExtendedBasicConnectionProvider.class, LibBasedConnectionProvider.class})
public class BasicExtension
{

}
