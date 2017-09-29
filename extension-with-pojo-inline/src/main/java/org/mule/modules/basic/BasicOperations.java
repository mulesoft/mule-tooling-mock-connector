package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Optional;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 * @param complexPojoAtOperation Complex Pojo at operation description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithPojoInline(@Config BasicExtensionConfig config, @Expression(ExpressionSupport.NOT_SUPPORTED) ComplexPojo complexPojoAtOperation, @Expression(ExpressionSupport.NOT_SUPPORTED) Ingredient ingredientAtOperation,
										  @Expression(ExpressionSupport.NOT_SUPPORTED) @Optional Ingredient optionalIngredientAtOperation) {
			return null;
	}

}
