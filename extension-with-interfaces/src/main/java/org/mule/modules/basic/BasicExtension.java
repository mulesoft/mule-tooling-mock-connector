package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connector.ConnectionProviders;

/**
 * Extension javadoc description
 */
@Extension(name = "Interfaces", description = "Interfaces Connector Description")
@Configurations({ BasicExtensionConfig.class })
@ConnectionProviders({ BasicConnectionProvider.class })
public class BasicExtension {

}