package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;

import java.util.List;

public class BasicOperations {

	/**
	 * Operation With String description
	 * @param config config description
	 * @param params String param description
	 * @param userIds String param description
	 */
	public List<String> operationWithString(@Config BasicExtensionConfig config, List<String> params, List<String> userIds) {
			return params;
	}

}
