package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Basic Connector with Streamming
 */
@Extension(name = "streaming")
@Configurations({ BasicExtensionConfig.class })
public class BasicExtension {

}
