package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;

/**
 * Extension javadoc description
 */
@Extension(name = "ErrorMapping", description = "Mule Module with error mapping")
@ErrorTypes(MyErrors.class)
@Configurations({BasicExtensionConfig.class})
public class BasicExtension
{

}
