package org.mule.modules.basic;

import java.util.List;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig {
	/**
	 * Config Parameters description
	 */
	@Parameter
	private List<String> configParameters;

}
