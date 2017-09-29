package org.mule.modules.basic;

import org.mule.modules.basic.model.RecursiveChainA;
import org.mule.modules.basic.model.RecursiveChainB;
import org.mule.modules.basic.model.RecursivePojo;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.List;

public class BasicOperations {

	/**
	 * Operation With Pojo description
	 *
	 * @param pojoParam Recursive pojo parameter
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithPojo(RecursivePojo pojoParam, RecursiveChainA chainA, RecursiveChainB chainB) {
			return null;
	}

	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithPojoList(List<RecursivePojo> pojoParams) {
		return null;
	}

}
