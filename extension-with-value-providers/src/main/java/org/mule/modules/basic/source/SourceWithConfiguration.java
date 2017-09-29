/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic.source;

import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.modules.basic.config.SimpleConfig;
import org.mule.modules.basic.resolver.WithConfigValueProvider;

@MediaType(MediaType.APPLICATION_PLAIN)
public class SourceWithConfiguration extends AbstractSource {

  @OfValues(WithConfigValueProvider.class)
  @Parameter
  private String channel;

  @Config
  SimpleConfig simpleConfig;

  public String getChannel()
  {
    return channel;
  }

  public void setChannel(String channel)
  {
    this.channel = channel;
  }
}
