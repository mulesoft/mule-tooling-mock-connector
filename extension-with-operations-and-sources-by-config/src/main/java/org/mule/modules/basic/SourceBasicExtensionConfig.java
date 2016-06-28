package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.connector.Providers;

/**
 * Config javadoc description
 */
@Configuration(name = "source-config", description = "Source Config Description")
@Sources({ BasicSource.class })
@Providers({SourceConnectionProvider.class})
public class SourceBasicExtensionConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String sourceConfigParameter;

}
