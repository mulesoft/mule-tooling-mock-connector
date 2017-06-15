package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.ExternalLib;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({ BasicOperations.class })
@ExternalLib( name = "FooDriver", requiredClassName = "org.mule.modules.FooDriver")
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
