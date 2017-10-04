/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic.source;

import org.mule.modules.basic.resolver.WithRequiredParametersValueProvider;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.values.OfValues;

import java.util.List;

@MediaType(value = MediaType.APPLICATION_PLAIN, strict = false)
public class SourceWithValuesWithRequiredParameters extends AbstractSource {

  @Parameter
  String requiredString;

  @Parameter
  boolean requiredBoolean;

  @Parameter
  int requiredInteger;

  @Parameter
  List<String> strings;

  @OfValues(WithRequiredParametersValueProvider.class)
  @Parameter
  String channels;
  
}
