package org.mule.modules.mockdynamic.mascot;


public class Breeder {

    public Breeder(String string) {
        setName(string);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    
}
