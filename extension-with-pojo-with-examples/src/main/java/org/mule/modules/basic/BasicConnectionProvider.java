package org.mule.modules.basic;

import org.mule.modules.basic.model.SimplePojo;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * Connection Provider description
 */
public class BasicConnectionProvider implements ConnectionProvider<DummyConnection> {


	/**
	 * SimplePojo At Provider description
	 */
	@Parameter
	private SimplePojo pojoAtConnection;

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

}
