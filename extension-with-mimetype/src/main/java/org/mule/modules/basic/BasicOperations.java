package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 * @param outputMimeType String param description
	 */
	public String operationWithMimeType(@UseConfig BasicExtensionConfig config, String outputMimeType) {
			return outputMimeType;
	}

}
