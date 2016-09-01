package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Import;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connector.ConnectionProviders;

/**
 * Extension javadoc description
 */
@Extension(name = "Imports", description = "Connectors With Imports Description")
@Operations({ AdvanceOperations.class })
@Configurations({ AdvanceExtensionConfig.class })
@ConnectionProviders({ AdvanceConnectionProvider.class })
@Import(type = ComplexPojo.class, from = "Pojo")
public class AdvanceExtension
{

}