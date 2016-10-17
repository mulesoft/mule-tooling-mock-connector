package org.mule.modules.basic;

import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.api.tls.TlsContextFactory;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.Optional;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
public class BasicExtensionConfig {
	/**
	 * Complex pojo at config description
	 */
	@Parameter
	@Optional
	@Expression(ExpressionSupport.NOT_SUPPORTED)
	private TlsContextFactory tlsContextAtConfig;

}
