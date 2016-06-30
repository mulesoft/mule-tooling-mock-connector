package org.mule.modules.advance;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class AdvanceExtensionConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
