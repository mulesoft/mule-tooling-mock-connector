package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Parameter;

import java.util.Map;

public class PojoWithMap
{

    @Parameter
    Map<String, String> properties;
}
