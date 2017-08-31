package org.mule.modules.basic;

import org.mule.modules.basic.model.Recipe;
import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Expression;
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
	@Expression(ExpressionSupport.NOT_SUPPORTED)
	private List<Recipe> recipes;

}
