package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.display.Password;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	public String operationWithString(@Password String param) {
			return param;
	}

}
