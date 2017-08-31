package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Sources;

/**
 * Configless Operations Connector Description
 */
@Extension(name = "Configless")
@Sources({ BasicSource.class })
@Operations({ BasicOperations.class })
public class BasicExtension {

}
