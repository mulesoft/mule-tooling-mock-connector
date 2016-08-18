package org.mule.modules.studio;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;

/**
 * Studio Extension used to test all connectors functionality.
 */
@Extension(name = "Studio", description = "Studio Connector For Testing")
@Operations({ StudioOperations.class })
@Configurations({ StudioExtensionConfig.class })
public class StudioExtension
{

}