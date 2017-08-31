package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Source Config Description
 */
@Configuration(name = "source-config")
@Sources({ BasicSource.class })
@ConnectionProviders({SourceConnectionProvider.class})
public class SourceBasicExtensionConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String sourceConfigParameter;

}
