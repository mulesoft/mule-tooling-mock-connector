package org.mule.modules.advance;

import org.mule.modules.basic.BasicExtension;
import org.mule.modules.basic.model.ComplexPojo;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Import;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connector.Providers;

/**
 * Extension javadoc description
 */
@Extension(name = "advance", description = "Advance Connector Description")
@Operations({ AdvanceOperations.class })
@Configurations({ AdvanceExtensionConfig.class })
@Providers({ AdvanceConnectionProvider.class })
@Import(type = ComplexPojo.class, from = BasicExtension.class)
public class AdvanceExtension
{

}