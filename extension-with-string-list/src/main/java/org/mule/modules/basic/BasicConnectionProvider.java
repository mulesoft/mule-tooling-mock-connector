package org.mule.modules.basic;

import java.util.List;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionHandlingStrategy;
import org.mule.runtime.api.connection.ConnectionHandlingStrategyFactory;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Connection Provider description
 */
public class BasicConnectionProvider implements ConnectionProvider<DummyConnection> {

	/**
	 * Provider parameters description
	 */
	@Parameter
	private List<String> providerParameters;

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

		public List<String> getProviderParameter() {
			return providerParameters;
		}

		public void setProviderParameter(List<String> providerParameters) {
			this.providerParameters = providerParameters;
		}
}
