package org.mule.modules.basic;

import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionHandlingStrategy;
import org.mule.runtime.api.connection.ConnectionHandlingStrategyFactory;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Connection Provider description
 */
public class BasicConnectionProvider implements ConnectionProvider<BasicExtensionConfig, DummyConnection> {

	/**
	 * Complex Pojo At Provider description
	 */
	@Parameter
	private ComplexPojo complexPojoAtConfig;

	/**
	 * Ingredient At Provider description
	 */
	@Parameter
	private Ingredient ingredientAtConfig;

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
