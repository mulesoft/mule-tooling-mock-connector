package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.api.meta.ExpressionSupport;

import java.util.Date;

/**
 * Config javadoc description
 */
@Configuration(name = "config", description = "Config Description")
@Operations({ BasicOperations.class })
public class BasicExtensionConfig
{

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private String stringParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private int intPrimitiveParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private Integer integerParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private Boolean booleanParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private boolean booleanPrimitiveParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private Date dateParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private float floatPrimitiveParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private Float floatParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private double doublePrimitiveParam;

    @Expression(ExpressionSupport.NOT_SUPPORTED)
    @Parameter
    private Double doubleParam;


}
