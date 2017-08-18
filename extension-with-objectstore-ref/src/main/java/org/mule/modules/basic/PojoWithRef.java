package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.reference.ObjectStoreReference;

public class PojoWithRef
{

    @ObjectStoreReference
    @Parameter
    @Optional
    private String objectStoreRefAtPojo;

    public String getObjectStoreRefAtPojo()
    {
        return objectStoreRefAtPojo;
    }

    public void setObjectStoreRefAtPojo(String objectStoreRefAtPojo)
    {
        this.objectStoreRefAtPojo = objectStoreRefAtPojo;
    }
}
