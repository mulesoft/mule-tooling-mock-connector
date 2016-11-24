package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class BasicOperations {

	/**
	 * Operation With One Pojo description
	 *
	 * @param config config description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	public String operationWithOnePojo(@UseConfig BasicExtensionConfig config, Ingredient ingredientAtOperation) {
			return null;
	}
	/**
	 * Operation With One Content Pojo description
	 *
	 * @param config config description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	public String operationWithOneContent(@UseConfig BasicExtensionConfig config, @Content Ingredient ingredientAtOperation) {
		return null;
	}

	/**
	 * Operation With Pojos description
	 *
	 * @param config config description
	 * @param complexPojoAtOperation Complex Pojo at operation description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	public String operationWithPojo(@UseConfig BasicExtensionConfig config, @Content ComplexPojo complexPojoAtOperation, Ingredient ingredientAtOperation) {
		return null;
	}
}
