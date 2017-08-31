package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;

/**
 * Pojo Connector Description
 */
@Extension(name = "AnnotatedPojo")
@Operations({BasicOperations.class})
public class BasicExtension {

}