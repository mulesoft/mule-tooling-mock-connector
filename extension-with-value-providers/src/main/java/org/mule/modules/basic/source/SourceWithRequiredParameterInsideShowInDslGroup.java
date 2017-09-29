/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic.source;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.modules.basic.GroupWithValuesParameter;
import org.mule.modules.basic.resolver.WithRequiredParameterFromGroupValueProvider;

@MediaType(MediaType.APPLICATION_PLAIN)
public class SourceWithRequiredParameterInsideShowInDslGroup extends AbstractSource {

  @OfValues(WithRequiredParameterFromGroupValueProvider.class)
  @Parameter
  String values;

  @ParameterGroup(name = "ValuesGroup", showInDsl = true)
  GroupWithValuesParameter optionsParameter;
}
