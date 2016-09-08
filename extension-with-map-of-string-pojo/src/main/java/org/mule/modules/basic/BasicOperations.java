package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param mapParameters Map param description
	 */
	public Ingredient operationWithMap(@UseConfig BasicExtensionConfig config, Map<String,Ingredient>  mapParameters) {
		return null;
	}

}
