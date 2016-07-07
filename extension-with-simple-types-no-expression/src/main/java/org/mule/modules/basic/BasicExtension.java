package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;

/**
 * Extension javadoc description
 */
@Extension(name = "Basic", description = "Basic Connector Description")
@Operations({ BasicOperations.class })
@Configurations({ BasicExtensionConfig.class })
public class BasicExtension {

}