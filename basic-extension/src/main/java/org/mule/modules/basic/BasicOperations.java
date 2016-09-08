package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config The extension config
	 * @param param String param description
	 */
	public String operationWithString(@UseConfig BasicExtensionConfig config, String param) {
			return param;
	}

}
