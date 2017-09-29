package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.Text;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 * @param param String param description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithString(@Config BasicExtensionConfig config,@Text String param) {
			return param;
	}

}
