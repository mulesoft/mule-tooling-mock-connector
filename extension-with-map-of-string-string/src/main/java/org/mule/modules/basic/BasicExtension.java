package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;

/**
 * Basic Connector Description
 */
@Extension(name = "MapStringString")
@Operations({BasicOperations.class})
public class BasicExtension
{

}
