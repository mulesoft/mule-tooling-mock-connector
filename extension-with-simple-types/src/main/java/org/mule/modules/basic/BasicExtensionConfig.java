package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import java.util.Date;

/**
 * Config Description
 */
@Configuration(name = "config")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig
{

    @Parameter
    private String stringParam;

    @Parameter
    private int intPrimitiveParam;

    @Parameter
    private Integer integerParam;

    @Parameter
    private boolean booleanPrimitiveParam;

    @Parameter
    private Date dateParam;

    @Parameter
    private float floatPrimitiveParam;

    @Parameter
    private Float floatParam;

    @Parameter
    private double doublePrimitiveParam;

    @Parameter
    private Double doubleParam;


}
