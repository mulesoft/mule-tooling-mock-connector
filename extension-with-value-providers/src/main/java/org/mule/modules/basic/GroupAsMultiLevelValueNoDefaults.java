/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.values.ValuePart;

public class GroupAsMultiLevelValueNoDefaults
{

  @Parameter
  @Alias("required")
  private String wsdlLocation;

  @ValuePart(order = 1)
  @Parameter
  private String continent;

  @ValuePart(order = 2)
  @Parameter
  private String country;

  @DisplayName("State | City")
  @ValuePart(order = 3)
  @Parameter
  private String city;

}
