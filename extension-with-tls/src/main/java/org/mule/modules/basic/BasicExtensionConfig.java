package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.api.tls.TlsContextFactory;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.Optional;

/**
 * Config Description
 */
@Configuration(name = "config")
public class BasicExtensionConfig {
	/**
	 * Complex pojo at config description
	 */
	@Parameter
	@Optional
	@Expression(ExpressionSupport.NOT_SUPPORTED)
	private TlsContextFactory tlsContextAtConfig;

}
