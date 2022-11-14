package com.companystructure;

/*
 * Author : Chittebabu
 * Objective : BusinessEmployee is the child class of Employee
 * Date : 9/11/2022
 */

public class BusinessEmployee extends Employee {
    // set base salary to 50000 in constructor method
    public BusinessEmployee(String name) {
        super(name, 50_000d);
    }

    @Override
    public String employeeStatus() {
        return getEmployeeId() + " " + getName() + " with a budget of 22500.0";
    }
}
