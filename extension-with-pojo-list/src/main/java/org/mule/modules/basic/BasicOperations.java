package org.mule.modules.basic;

import org.mule.modules.basic.model.Recipe;

import java.util.List;

public class BasicOperations {

	/**
	 * Operation With String description
	 *
	 * @param recipes String param description
	 */
	public List<Recipe> operationWithPojoList(List<Recipe> recipes) {
			return recipes;
	}

}
