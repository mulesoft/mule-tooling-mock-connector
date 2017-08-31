package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Source And Operation Config Description
 */
@Configuration(name = "source-and-operation-config")
@Sources({ BasicSource.class })
@Operations(BasicOperations.class)
@ConnectionProviders({SourceConnectionProvider.class})
public class SourceAndOperationsBasicExtensionConfig implements IConfig
{
	/**
	 * Config Parameter description
	 */
	@Parameter
	private String sourceConfigParameter;

}
