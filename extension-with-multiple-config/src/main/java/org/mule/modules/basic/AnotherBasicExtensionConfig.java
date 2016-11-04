package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "another-config", description = "Another Config Description")
@Operations({BasicOperations.class})
public class AnotherBasicExtensionConfig extends BaseConfig{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String anotherConfigParameter;

}
