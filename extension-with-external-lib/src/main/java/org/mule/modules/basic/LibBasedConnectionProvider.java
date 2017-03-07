package org.mule.modules.basic;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.ExternalLib;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Connection Provider description
 */
@ExternalLib( name = "LibProvider", fileName = "external-lib.*\\.jar")
@Alias("lib-provider")
public class LibBasedConnectionProvider implements ConnectionProvider<DummyConnection> {

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
