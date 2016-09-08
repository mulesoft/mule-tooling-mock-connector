package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({ AdvanceOperations.class })
public class AdvanceExtensionConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
