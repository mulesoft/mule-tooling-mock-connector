package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.Sources;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
@Sources({BasicSource.class})
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
