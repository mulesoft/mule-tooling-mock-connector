package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;

/**
 * Mule Module with error mapping
 */
@Extension(name = "ErrorMapping")
@ErrorTypes(MyErrors.class)
@Configurations({BasicExtensionConfig.class})
public class BasicExtension
{

}
