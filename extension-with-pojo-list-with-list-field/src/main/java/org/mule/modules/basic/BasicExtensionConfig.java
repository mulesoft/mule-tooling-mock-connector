package org.mule.modules.basic;

import org.mule.modules.basic.model.Recipe;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.List;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig {
	/**
	 * Config Recipes description
	 */
	@Parameter
	private List<Recipe> recipes;

}
