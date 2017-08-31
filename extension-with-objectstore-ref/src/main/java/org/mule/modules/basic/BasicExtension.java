package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.reference.ObjectStoreReference;

/**
 * Basic Connector with @ObjectStoreReference
 */
@Extension(name = "ObjectStoreRef")
@Operations({BasicOperations.class})
public class BasicExtension
{

    @ObjectStoreReference
    @Parameter
    private String objectStoreRefAtConfig;

    public String getObjectStoreRefAtConfig()
    {
        return objectStoreRefAtConfig;
    }

    public void setObjectStoreRefAtConfig(String objectStoreRefAtConfig)
    {
        this.objectStoreRefAtConfig = objectStoreRefAtConfig;
    }
}
