package org.mule.modules.stereotypes;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Export;
import org.mule.runtime.extension.api.annotation.Extension;

/**
 * Basic Connector Description
 */
@Extension(name = "Stereotypes")
@Export(classes = {MyTypeWithCustomStereotype.class})
@Configurations({ BasicExtensionConfig.class })
public class BasicExtension {

}
