package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param mapParameter Map param description
	 */
	@MediaType(MediaType.APPLICATION_PLAIN)
	public String operationWithMapStringString(@Content Map<String,String>  mapParameter) {
			return null;
	}

}
