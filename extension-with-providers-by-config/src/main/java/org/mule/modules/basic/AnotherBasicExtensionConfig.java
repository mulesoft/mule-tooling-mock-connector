package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Another Config Description
 */
@Configuration(name = "another-config")
@Operations({AnotherBasicOperations.class})
@ConnectionProviders({FooConnectionProvider.class})
public class AnotherBasicExtensionConfig extends BaseConfig{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String anotherConfigParameter;

}
