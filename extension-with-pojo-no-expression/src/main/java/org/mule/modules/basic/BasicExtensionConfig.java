package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig {
	/**
	 * Complex pojo at config description
	 */
	@Parameter
	@Expression(ExpressionSupport.NOT_SUPPORTED)
	private ComplexPojo complexPojoAtConfig;

	/**
	 * Ingredient At Config description
	 */
	@Parameter
	@Expression(ExpressionSupport.NOT_SUPPORTED)
	private Ingredient ingredientAtConfig;

}
