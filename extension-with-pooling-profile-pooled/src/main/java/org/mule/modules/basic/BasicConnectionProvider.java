package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.api.connection.PoolingConnectionProvider;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Connection Provider description
 */
public class BasicConnectionProvider implements PoolingConnectionProvider<DummyConnection>
{

	/**
	 * Provider parameter description
	 */
	@Parameter
	private String providerParameter;

	@Override
	public DummyConnection connect() throws ConnectionException {
		return null;
	}

	@Override
	public void disconnect(DummyConnection connection) {

	}

	@Override
	public ConnectionValidationResult validate(DummyConnection connection) {
		return null;
	}

		public String getProviderParameter() {
			return providerParameter;
		}

		public void setProviderParameter(String providerParameter) {
			this.providerParameter = providerParameter;
		}
}
