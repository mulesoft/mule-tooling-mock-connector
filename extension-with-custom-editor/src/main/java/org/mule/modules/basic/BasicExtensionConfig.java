package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
