package org.mule.modules.basic;

import static org.mule.runtime.extension.api.introspection.parameter.ExpressionSupport.NOT_SUPPORTED;
import org.mule.modules.basic.model.ComplexPojo;
import org.mule.modules.basic.model.Ingredient;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.Parameter;

/**
 * Connection Provider description
 */
public class BasicConnectionProvider implements ConnectionProvider<DummyConnection> {

	/**
	 * Complex Pojo At Provider description
	 */
	@Parameter
	@Expression(NOT_SUPPORTED)
	private ComplexPojo complexPojoAtProvider;

	/**
	 * Ingredient At Provider description
	 */
	@Parameter
	@Expression(NOT_SUPPORTED)
	private Ingredient ingredientAtProvider;

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