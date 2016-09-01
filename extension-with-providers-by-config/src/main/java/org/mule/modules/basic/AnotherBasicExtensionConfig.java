package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.connector.ConnectionProviders;

/**
 * Config javadoc description
 */
@Configuration(name = "another-config", description = "Another Config Description")
@Operations({AnotherBasicOperations.class})
@ConnectionProviders({FooConnectionProvider.class})
public class AnotherBasicExtensionConfig extends BaseConfig{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String anotherConfigParameter;

}
