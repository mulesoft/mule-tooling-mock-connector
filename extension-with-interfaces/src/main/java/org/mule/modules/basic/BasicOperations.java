package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Config;

import java.util.List;

public class BasicOperations {

	/**
	 * Operation With Interfaces description
	 *
	 * @param config config description
	 * @param callable ICallable param description
	 * @param callables List of ICallable param description
	 */
	public ICallable operationWithInterfaces(@Config BasicExtensionConfig config, ICallable callable, List<ICallable> callables) {
			return callable;
	}

}
