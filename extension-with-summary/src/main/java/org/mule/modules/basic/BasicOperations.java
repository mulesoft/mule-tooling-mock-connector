package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class BasicOperations {

	/**
	 * Operation With Pojo description
	 *
	 * @param config config description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	@Summary("Operation Summary")
	public String operationWithPojo(@UseConfig BasicExtensionConfig config, Ingredient ingredientAtOperation, @Summary("Parameter Summary") String stringParam) {
			return null;
	}

}
