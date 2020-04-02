/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic;

import static org.mule.metadata.api.model.MetadataFormat.JAVA;
import org.mule.metadata.api.builder.BaseTypeBuilder;
import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;

import org.apache.commons.lang3.StringUtils;

public class TestOutputAnyTypePartialResolver implements OutputTypeResolver<PojoKey> {

  @Override
  public MetadataType getOutputType(MetadataContext context, PojoKey key)
          throws MetadataResolvingException, ConnectionException {
    if (StringUtils.isNotBlank(key.getFilter())) {
      Integer isNumber = Integer.valueOf(key.getType());
      if (isNumber > 5) {
        return BaseTypeBuilder.create(JAVA).anyType().build();
      }
      else {
        return BaseTypeBuilder.create(JAVA).stringType().build();
      }
    }
    else {
      if (StringUtils.isNotBlank(key.getType())) {
        return BaseTypeBuilder.create(JAVA).stringType().build();
      }
      else {
        return BaseTypeBuilder.create(JAVA).numberType().build();
      }
    }
  }

  @Override
  public String getCategoryName() {
    return "PojoKeyCategory";
  }

  @Override
  public String getResolverName() {
    return "TestOutputAnyTypePartialResolver";
  }
}
