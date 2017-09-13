package org.mule.modules.basic.model;

/**
 * Dummy Pojo for test
 */
public class NotTopLevelPojo
{

    private final String pojoField;

    public NotTopLevelPojo(String pojoField)
    {
        this.pojoField = pojoField;
    }

    public String getPojoField()
    {
        return pojoField;
    }

}