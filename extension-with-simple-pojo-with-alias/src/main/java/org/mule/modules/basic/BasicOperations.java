package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.Config;

public class BasicOperations {

	/**
	 * Operation With Pojo description
	 *
	 * @param config config description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	public String operationWithPojo(@Config BasicExtensionConfig config, Ingredient ingredientAtOperation) {
			return null;
	}

}
