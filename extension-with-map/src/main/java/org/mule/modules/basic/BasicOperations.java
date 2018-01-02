package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param config config description
	 * @param mapParameter Map param description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithMap(@Config BasicExtensionConfig config, Map<String,Object>  mapParameter) {
			return null;
	}

	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithMapNoExpression(@Config BasicExtensionConfig config, Map<String,Object>  mapParameter) {
			return null;
	}
}
