package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Content;

import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param mapParameter Map param description
	 */
	public String operationWithMapStringString(@Content Map<String,String>  mapParameter) {
			return null;
	}

}
