package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.List;
import java.util.Map;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	private List<Map<String,Object>> mapParameters;

}
