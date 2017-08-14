package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;

import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param config config description
	 * @param mapParameter Map param description
	 */
	public String operationWithMap(@Config BasicExtensionConfig config, Map<String,String>  mapParameter) {
			return null;
	}

}
