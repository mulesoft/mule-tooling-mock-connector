package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;

/**
 * Basic Connector with @FlowReference
 */
@Extension(name = "Routes")
@Operations({BasicOperations.class,StereotypedOperations.class,OtherStereotypedOperations.class})
public class BasicExtension
{

}
