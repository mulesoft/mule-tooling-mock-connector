package org.mule.modules.basic;

import org.mule.modules.basic.model.AnnotatedPojo;
import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations {

	/**
	 * Operation With String description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithPojo(AnnotatedPojo pojo) {
			return null;
	}

}
