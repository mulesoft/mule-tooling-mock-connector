package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 * @param complexPojoAtOperation Complex Pojo at operation description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	@MediaType(MediaType.APPLICATION_PLAIN)
	public String operationWithPojo(@Config BasicExtensionConfig config, @Expression(ExpressionSupport.NOT_SUPPORTED) ComplexPojo complexPojoAtOperation, @Expression(ExpressionSupport.NOT_SUPPORTED) Ingredient ingredientAtOperation) {
			return null;
	}

}
