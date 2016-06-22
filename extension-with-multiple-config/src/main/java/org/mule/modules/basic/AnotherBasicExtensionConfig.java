package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "another-config", description = "Another Config Description")
public class AnotherBasicExtensionConfig extends BaseConfig{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String anotherConfigParameter;

}
