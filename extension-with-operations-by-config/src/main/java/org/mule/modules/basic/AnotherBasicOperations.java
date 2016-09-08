package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.UseConfig;


public class AnotherBasicOperations
{

	/**
	 * Operation With Double description
	 *
	 * @param param Double param description
	 */
	public Double operationWithDouble(@UseConfig AnotherBasicExtensionConfig config, Double param) {
			return param;
	}

}
