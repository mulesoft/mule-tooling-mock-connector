package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	@MediaType(MediaType.APPLICATION_PLAIN)
	public String operationWithString(String param) {
			return param;
	}

}
