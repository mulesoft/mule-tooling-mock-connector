package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithMimeType(@Config BasicExtensionConfig config) {
			return "";
	}

}
