package org.mule.modules.basic;

import org.mule.modules.basic.model.SimplePojo;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig {

	/**
	 * SimplePojo At Config description
	 */
	@Parameter
	private SimplePojo pojoAtConfig;

}