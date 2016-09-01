package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.capability.CustomStudioEditor;
import org.mule.runtime.extension.api.annotation.connector.ConnectionProviders;

/**
 * Extension javadoc description
 */
@Extension(name = "BasicCustomEditor", description = "Basic Connector With Custom Editor")
@Operations({ BasicOperations.class })
@Configurations({ BasicExtensionConfig.class })
@ConnectionProviders({ BasicConnectionProvider.class })
@CustomStudioEditor(fileName= "my-editor.xml")
public class BasicExtension {

}
