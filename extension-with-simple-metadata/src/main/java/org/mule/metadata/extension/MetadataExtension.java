/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.metadata.extension;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@Extension(name = "Simple Metadata")
@Operations({MetadataOperations.class})
@ConnectionProviders(MetadataConnectionProvider.class)
@Xml(namespace = "http://www.mulesoft.org/schema/mule/simple-metadata", prefix = "simple-metadata")
public class MetadataExtension {

  @Parameter
  @Optional(defaultValue = "noExpression")
  private String data;
  @Parameter
  @Optional(defaultValue = "#['defaultString']")
  private String dataWithDefault;

  public String getData() {
    return data;
  }

  public String getDataWithDefault() {
    return dataWithDefault;
  }
}
