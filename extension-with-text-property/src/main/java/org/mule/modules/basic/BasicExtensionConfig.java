package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Text;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	@Text
	private String configParameter;

}
