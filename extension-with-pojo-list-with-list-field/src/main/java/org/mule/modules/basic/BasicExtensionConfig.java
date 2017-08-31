package org.mule.modules.basic;

import org.mule.modules.basic.model.Recipe;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import java.util.List;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig {
	/**
	 * Config Recipes description
	 */
	@Parameter
	private List<Recipe> recipes;

}
