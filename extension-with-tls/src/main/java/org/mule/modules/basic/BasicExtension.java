package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connector.Providers;

/**
 * Extension javadoc description
 */
@Extension(name = "ExtensionWihTls", description = "TLS Connector Description")
@Operations({ BasicOperations.class })
@Configurations({ BasicExtensionConfig.class })
@Providers({ BasicConnectionProvider.class })
public class BasicExtension {

}
