package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.io.InputStream;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	public InputStream operationWithStreaming(@UseConfig BasicExtensionConfig config, String param) {
			return null;
	}

}
