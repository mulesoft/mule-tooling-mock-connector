package org.mule.modules.mockdynamic.utils;

/**
 * Created with IntelliJ IDEA.
 * User: matiaspentreath
 * Date: 9/30/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends Person {

    private String employeeNumber;
    private String position;


    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPosition() {
        return position;

    }

    public void setPosition(String position) {
        this.position = position;
    }




}
