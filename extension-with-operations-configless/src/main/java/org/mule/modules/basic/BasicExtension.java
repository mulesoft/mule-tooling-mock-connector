package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Sources;

/**
 * Extension javadoc description
 */
@Extension(name = "Configless", description = "Configless Operations Connector Description")
@Sources({ BasicSource.class })
@Operations({ BasicOperations.class })
public class BasicExtension {

}
