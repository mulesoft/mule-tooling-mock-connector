package org.mule.modules.basic;

import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.extension.api.annotation.param.UseConfig;

import java.util.List;
import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param mapParameters Map param description
	 */
	public String operationWithMap(@UseConfig BasicExtensionConfig config, Map<String,List<Ingredient>> mapParameters) {
			return null;
	}

}
