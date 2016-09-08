package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({BasicOperations.class,SharedOperations.class})
public class BasicExtensionConfig extends BaseConfig{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
