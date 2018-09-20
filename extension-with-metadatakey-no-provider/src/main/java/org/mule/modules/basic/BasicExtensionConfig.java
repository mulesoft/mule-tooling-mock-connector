package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String configParameter;

	@Parameter
	@Optional(defaultValue = "10000")
	private Integer keySetSize;

	public String getConfigParameter() {
		return configParameter;
	}

	public void setConfigParameter(String configParameter) {
		this.configParameter = configParameter;
	}

	public Integer getKeySetSize() {
		return keySetSize;
	}

	public void setKeySetSize(Integer keySetSize) {
		this.keySetSize = keySetSize;
	}
}
