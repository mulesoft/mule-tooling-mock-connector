package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 * @param complexPojoAtOperation Complex Pojo at operation description
	 * @param ingredientAtOperation Ingredient at operation description
	 */
	public String operationWithPojo(@UseConfig BasicExtensionConfig config, ComplexPojo complexPojoAtOperation, Ingredient ingredientAtOperation) {
			return null;
	}

}
