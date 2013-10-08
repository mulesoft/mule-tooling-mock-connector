/**
 *
 */
package org.mule.modules.mockdynamic;

public class User
{

    private String name;
    private int age;
    private long money;
    private boolean male;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public long getMoney()
    {
        return money;
    }

    public void setMoney(long money)
    {
        this.money = money;
    }

    public boolean isMale()
    {
        return male;
    }

    public void setMale(boolean male)
    {
        this.male = male;
    }
}
