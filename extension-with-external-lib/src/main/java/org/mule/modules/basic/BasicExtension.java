package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Extension javadoc description
 */
@Extension(name = "ExternalLib", description = "ExternalLib Connector Description")
@Configurations({BasicExtensionConfig.class})
@ConnectionProviders({BasicConnectionProvider.class, ExtendedBasicConnectionProvider.class, LibBasedConnectionProvider.class})
public class BasicExtension
{

}
