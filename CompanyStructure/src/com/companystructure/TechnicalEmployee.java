package com.companystructure;

/*
 * Author : Chittebabu
 * Objective : TechnicalEmployee is the child class of Employee
 * Date : 9/11/2022
 */

public class TechnicalEmployee extends Employee {
    // set base salary to 75000 in constructor method
    public TechnicalEmployee(String name) {
        super(name, 75_000d);
    }

    @Override
    public String employeeStatus() {
        return getEmployeeId() + " " + getName() + " has 10 successful check-ins";
    }
}
