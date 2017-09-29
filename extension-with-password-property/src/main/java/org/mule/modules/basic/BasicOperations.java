package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.Password;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param config config description
	 * @param param String param description
	 */
	@MediaType(MediaType.APPLICATION_PLAIN)
	public String operationWithString(@Config BasicExtensionConfig config, @Password String param) {
			return param;
	}

}
