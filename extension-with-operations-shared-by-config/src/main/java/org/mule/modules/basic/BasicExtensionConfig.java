package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({BasicOperations.class})
@ConnectionProviders({BasicConnectionProvider.class})
public class BasicExtensionConfig implements IConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
