/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.basic;

import org.mule.modules.basic.config.ConfigWithValueAndRequiredParam;
import org.mule.modules.basic.config.ConfigWithValueParameter;
import org.mule.modules.basic.config.ConfigWithValuesWithRequiredParamsFromParamGroup;
import org.mule.modules.basic.config.ConfigWithValuesWithRequiredParamsFromShowInDslGroup;
import org.mule.modules.basic.config.SimpleConfig;
import org.mule.modules.basic.source.SimpleSource;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Sources;

@Extension(name = "ValuesProviders")
@Configurations({SimpleConfig.class, ConfigWithValueParameter.class,
    ConfigWithValueAndRequiredParam.class, ConfigWithValuesWithRequiredParamsFromParamGroup.class,
    ConfigWithValuesWithRequiredParamsFromShowInDslGroup.class})
@Sources({SimpleSource.class})
public class ValuesExtension {

}
