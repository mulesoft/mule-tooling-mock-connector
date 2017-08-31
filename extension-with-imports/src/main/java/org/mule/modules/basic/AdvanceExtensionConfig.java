package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ AdvanceOperations.class })
public class AdvanceExtensionConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
