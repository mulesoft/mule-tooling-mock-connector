package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.annotation.param.display.Password;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param config config description
	 * @param param String param description
	 */
	public String operationWithString(@UseConfig BasicExtensionConfig config, @Password String param) {
			return param;
	}

}
