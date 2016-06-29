package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionHandlingStrategy;
import org.mule.runtime.api.connection.ConnectionHandlingStrategyFactory;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.Map;

/**
 * Connection Provider description
 */
public class BasicConnectionProvider implements ConnectionProvider<DummyConnection> {

	/**
	 * Provider parameter description
	 */
	@Parameter
	private Map<String,Object> mapParameter;

	@Override
	public DummyConnection connect() throws ConnectionException {
		return null;
	}

	@Override
	public void disconnect(DummyConnection connection) {

	}

	@Override
	public ConnectionHandlingStrategy<DummyConnection> getHandlingStrategy(
			ConnectionHandlingStrategyFactory<DummyConnection> factory) {
		return factory.none();
	}

	@Override
	public ConnectionValidationResult validate(DummyConnection connection) {
		return null;
	}

}
