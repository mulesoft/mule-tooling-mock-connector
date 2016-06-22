package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.List;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig {
	/**
	 * Config Parameter description
	 */
	@Parameter
	private ICallable callable;

	/**
	 * List of Callables at Config
	 */
	@Parameter
	private List<ICallable> callables;

}
