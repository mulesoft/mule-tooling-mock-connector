package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.io.InputStream;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public InputStream operationWithStreaming(@Config BasicExtensionConfig config, String param) {
			return null;
	}

}
