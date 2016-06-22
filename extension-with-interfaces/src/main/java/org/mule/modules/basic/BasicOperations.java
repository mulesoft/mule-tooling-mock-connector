package org.mule.modules.basic;

import java.util.List;

public class BasicOperations {

	/**
	 * Operation With Interfaces description
	 *
	 * @param callable ICallable param description
	 * @param callables List of ICallable param description
	 */
	public ICallable operationWithInterfaces(ICallable callable, List<ICallable> callables) {
			return callable;
	}

}
