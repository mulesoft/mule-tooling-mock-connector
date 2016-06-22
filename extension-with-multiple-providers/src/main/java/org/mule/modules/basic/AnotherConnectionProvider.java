package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionHandlingStrategy;
import org.mule.runtime.api.connection.ConnectionHandlingStrategyFactory;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.Text;

/**
 * Another Connection Provider description
 */
@Alias("another-provider")
public class AnotherConnectionProvider implements ConnectionProvider<BasicExtensionConfig, DummyConnection> {

	/**
	 * Provider parameter description
	 */
	@Parameter
	@Text
	private String anotherProviderParameter;

	@Override
	public DummyConnection connect(BasicExtensionConfig config) throws ConnectionException {
		return null;
	}

	@Override
	public void disconnect(DummyConnection connection) {

	}

	@Override
	public ConnectionHandlingStrategy<DummyConnection> getHandlingStrategy(
			ConnectionHandlingStrategyFactory<BasicExtensionConfig, DummyConnection> factory) {
		return factory.none();
	}

	@Override
	public ConnectionValidationResult validate(DummyConnection connection) {
		return null;
	}
}
