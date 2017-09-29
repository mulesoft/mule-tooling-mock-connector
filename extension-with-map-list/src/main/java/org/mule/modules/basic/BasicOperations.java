package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import java.util.List;
import java.util.Map;

public class BasicOperations {

	/**
	 * Operation With Map description
	 *
	 * @param config config description
	 * @param mapParameters Map param description
	 */
	@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
	public String operationWithMap(@Config BasicExtensionConfig config, List<Map<String,Object>> mapParameters, @Expression(ExpressionSupport.REQUIRED) List<Map<String,Object>> requiredMaps, @Content List<Map<String,Object>> contentMaps) {
			return null;
	}

}
