package org.mule.modules.basic;

import java.util.List;

import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	public List<String> operationWithString(List<String> params) {
			return params;
	}

}
