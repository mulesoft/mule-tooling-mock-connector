package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class BasicOperations {

	/**
	 * Operation With Pojo description
	 *
	 * @param config config description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	@Summary("Operation Summary")
	@MediaType(MediaType.APPLICATION_PLAIN)
	public String operationWithPojo(@Config BasicExtensionConfig config, Ingredient ingredientAtOperation, @Summary("Parameter Summary") String stringParam) {
			return null;
	}

}
