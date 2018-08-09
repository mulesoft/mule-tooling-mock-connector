package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Summary("Parameter with summary")
	@Parameter
	private String configParameter;

}
