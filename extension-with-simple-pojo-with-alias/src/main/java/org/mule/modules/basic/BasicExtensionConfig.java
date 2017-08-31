package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig {

	/**
	 * Ingredient At Config description
	 */
	@Parameter
	private Ingredient ingredientAtConfig;

}
