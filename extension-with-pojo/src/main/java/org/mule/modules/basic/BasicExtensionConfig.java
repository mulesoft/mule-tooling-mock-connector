package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig {
	/**
	 * Complex pojo at config description
	 */
	@Parameter
	private ComplexPojo complexPojoAtConfig;

	/**
	 * Ingredient At Config description
	 */
	@Parameter
	private Ingredient ingredientAtConfig;

}
