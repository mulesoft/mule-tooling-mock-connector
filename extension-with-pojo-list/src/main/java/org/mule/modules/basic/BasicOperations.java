package org.mule.modules.basic;

import org.mule.modules.basic.model.Recipe;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.util.List;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param config config description
	 * @param recipes String param description
	 */
	public List<Recipe> operationWithPojoList(@UseConfig BasicExtensionConfig config, List<Recipe> recipes) {
			return recipes;
	}

	public List<Recipe> anotherOperationWithPojoList(@UseConfig BasicExtensionConfig config, List<Recipe> myRecipes) {
		return myRecipes;
	}

}
