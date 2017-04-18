package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;

import java.io.InputStream;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	public InputStream operationWithStreaming(@Config BasicExtensionConfig config, String param) {
			return null;
	}

}
