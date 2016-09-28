package org.mule.modules.basic;

import org.mule.modules.basic.model.RecursiveChainA;
import org.mule.modules.basic.model.RecursiveChainB;
import org.mule.modules.basic.model.RecursivePojo;

import java.util.List;

public class BasicOperations {

	/**
	 * Operation With Pojo description
	 *
	 * @param pojoParam Recursive pojo parameter
	 */
	public String operationWithPojo(RecursivePojo pojoParam, RecursiveChainA chainA, RecursiveChainB chainB) {
			return null;
	}

	public String operationWithPojoList(List<RecursivePojo> pojoParams) {
		return null;
	}

}
