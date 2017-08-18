package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.reference.ObjectStoreReference;

/**
 * Extension javadoc description
 */
@Extension(name = "ObjectStoreRef", description = "Basic Connector with @ObjectStoreReference")
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
