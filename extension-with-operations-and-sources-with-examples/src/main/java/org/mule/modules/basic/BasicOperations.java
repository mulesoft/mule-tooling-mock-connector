package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.display.Example;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param param String param description
	 */
	public String operationWithString(@Config BasicExtensionConfig config, String param) {
			return param;
	}

	public void setUsername(@Example("Example for Operations's Parameter") String username)
	{
		this.username = username;
	}


}
