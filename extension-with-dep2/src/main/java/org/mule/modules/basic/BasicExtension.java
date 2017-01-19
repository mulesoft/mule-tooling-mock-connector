package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;

/**
 * Extension javadoc description
 */
@Extension(name = "BasicDep2", description = "Basic Connector Description")
@Operations({ BasicOperations.class })
public class BasicExtension {

}