package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 */
	@MediaType(MediaType.APPLICATION_PLAIN)
	public String operationWithMimeType(@Config BasicExtensionConfig config) {
			return "";
	}

}
