package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connector.ConnectionProviders;

/**
 * Extension javadoc description
 */
@Extension(name = "Metadata", description = "Basic Connector Description")
@Configurations({ BasicExtensionConfig.class })
@ConnectionProviders(MetadataConnectionProvider.class)
public class BasicExtension {

}
