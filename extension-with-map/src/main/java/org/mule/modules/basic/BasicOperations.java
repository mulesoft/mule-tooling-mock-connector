package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param config config description
	 * @param mapParameter Map param description
	 */
	public String operationWithMap(@UseConfig BasicExtensionConfig config, Map<String,Object>  mapParameter) {
			return null;
	}

}
