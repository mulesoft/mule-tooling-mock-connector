/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic;

import org.mule.modules.basic.resolver.MultiLevelValueProvider;
import org.mule.modules.basic.resolver.SimpleValueProvider;
import org.mule.modules.basic.resolver.WithConfigValueProvider;
import org.mule.modules.basic.resolver.WithConnectionValueProvider;
import org.mule.modules.basic.resolver.WithMuleContextValueProvider;
import org.mule.modules.basic.resolver.WithRequiredParameterFromGroupValueProvider;
import org.mule.modules.basic.resolver.WithRequiredParametersValueProvider;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.values.OfValues;

import java.util.List;

public class ValuesOperations {

  public void singleValuesEnabledParameter(@OfValues(SimpleValueProvider.class) String channels) {

  }

  public void singleValuesEnabledParameterWithConnection(@OfValues(WithConnectionValueProvider.class) String channels,
                                                         @Connection ValuesConnection connection) {}

  public void singleValuesEnabledParameterWithConfiguration(@OfValues(WithConfigValueProvider.class) String channels,
                                                            @Connection ValuesConnection connection) {}

  public void singleValuesEnabledParameterWithRequiredParameters(String requiredString,
                                                                 boolean requiredBoolean,
                                                                 int requiredInteger,
                                                                 List<String> strings,
                                                                 @OfValues(WithRequiredParametersValueProvider.class) String channels) {}

  public void singleValuesEnabledParameterInsideParameterGroup(@ParameterGroup(
      name = "ValuesGroup") GroupWithValuesParameter optionsParameter) {}

  public void singleValuesEnabledParameterRequiresValuesOfParameterGroup(@ParameterGroup(
                                                                             name = "ValuesGroup") GroupWithValuesParameter optionsParameter,
                                                                         @OfValues(WithRequiredParameterFromGroupValueProvider.class) String values) {}

  public void multiLevelValue(@OfValues(MultiLevelValueProvider.class) @ParameterGroup(
      name = "values") GroupAsMultiLevelValue optionsParameter) {

  }

  public void multiLevelValueNoDefaults(@OfValues(MultiLevelValueProvider.class) @ParameterGroup(
          name = "values") GroupAsMultiLevelValueNoDefaults optionsParameter) {

  }
  public void singleValuesWithRequiredParameterWithAlias(@ParameterGroup(
      name = "someGroup") WithRequiredParameterWithAliasGroup group) {}

  public void resolverGetsMuleContextInjection(@OfValues(WithMuleContextValueProvider.class) String channel) {

  }

  public void valuesInsideShowInDslGroup(@ParameterGroup(name = "ValuesGroup",
                                             showInDsl = true) GroupWithValuesParameter optionsParameter,
                                         @OfValues(WithRequiredParameterFromGroupValueProvider.class) String values) {

  }
}
