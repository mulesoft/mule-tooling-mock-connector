package org.mule.modules.basic;

import org.mule.modules.basic.model.BasePojo;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Connection Provider description
 */
public class BasicConnectionProvider implements ConnectionProvider<DummyConnection> {

	/**
	 * Provider parameter description
	 */
	@Parameter
	private String providerParameter;

	@Parameter
	@Expression(ExpressionSupport.SUPPORTED)
	private BasePojo basePojo;

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

	public BasePojo getBasePojo()
	{
		return basePojo;
	}

	public void setBasePojo(BasePojo basePojo)
	{
		this.basePojo = basePojo;
	}
}
