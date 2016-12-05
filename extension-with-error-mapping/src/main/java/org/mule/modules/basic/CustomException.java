package org.mule.modules.basic;

public class CustomException extends Exception
{

    private MyErrors type;

    public CustomException(MyErrors type)
    {
        this.type = type;
    }

    public MyErrors getType()
    {
        return type;
    }
}
