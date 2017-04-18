package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;

public class AnotherBasicOperations
{

	/**
	 * Operation With Double description
	 *
	 * @param param Double param description
	 */
	public Double operationWithDouble(@Config AnotherBasicExtensionConfig config, Double param) {
			return param;
	}

}
