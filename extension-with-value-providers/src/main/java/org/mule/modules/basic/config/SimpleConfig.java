/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic.config;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.modules.basic.ValuesOperations;
import org.mule.modules.basic.connection.ConnectionWithValueParameter;
import org.mule.modules.basic.connection.ConnectionWithValueWithRequiredParam;
import org.mule.modules.basic.connection.ConnectionWithValuesWithRequiredParamsFromParamGroup;
import org.mule.modules.basic.connection.ConnectionWithValuesWithRequiredParamsFromShowInDslGroup;
import org.mule.modules.basic.connection.ValuesConnectionProvider;
import org.mule.modules.basic.source.SourceWithConfiguration;
import org.mule.modules.basic.source.SourceWithConnection;
import org.mule.modules.basic.source.SourceWithMultiLevelValue;
import org.mule.modules.basic.source.SourceWithRequiredParameterInsideShowInDslGroup;
import org.mule.modules.basic.source.SourceWithRequiredParameterWithAlias;
import org.mule.modules.basic.source.SourceWithValuesWithRequiredParameterInsideParamGroup;
import org.mule.modules.basic.source.SourceWithValuesWithRequiredParameters;

import java.util.List;

@Configuration(name = "config")
@ConnectionProviders({ValuesConnectionProvider.class, ConnectionWithValueParameter.class,
    ConnectionWithValueWithRequiredParam.class, ConnectionWithValuesWithRequiredParamsFromParamGroup.class,
    ConnectionWithValuesWithRequiredParamsFromShowInDslGroup.class})
@Operations({ValuesOperations.class})
@Sources({SourceWithConfiguration.class, SourceWithConnection.class, SourceWithValuesWithRequiredParameters.class,
    SourceWithValuesWithRequiredParameterInsideParamGroup.class,
    SourceWithRequiredParameterWithAlias.class, SourceWithRequiredParameterInsideShowInDslGroup.class,
    SourceWithMultiLevelValue.class})
public class SimpleConfig {

  @Parameter
  @Optional(defaultValue = "noExpression")
  private String data;

  @Parameter
  @Optional
  private List<String> configValues;

  public String getData() {
    return data;
  }

  public List<String> getConfigValues() {
    return configValues;
  }
}
