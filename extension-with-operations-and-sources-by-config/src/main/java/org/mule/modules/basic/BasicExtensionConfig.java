package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Source And Operation Config Description
 */
@Configuration(name = "config")
@Operations({BasicOperations.class})
@ConnectionProviders({BasicConnectionProvider.class})
public class BasicExtensionConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

}
