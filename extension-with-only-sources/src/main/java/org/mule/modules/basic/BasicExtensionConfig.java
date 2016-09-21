package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.Sources;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Sources({ BasicSource.class, AnotherSource.class })
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
