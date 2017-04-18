package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	public String operationWithString(@Config BaseConfig config, String param) {
			return param;
	}

}
