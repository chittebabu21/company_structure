package com.companystructure;

/*
 * Author : Chittebabu
 * Objective : Parent class for company structure
 * Date : 9/11/2022
 */

public abstract class Employee {
    private static int counter = 1;
    private String name;
    private double baseSalary;
    private int employeeId;
    private Employee manager;

    // create constructor method
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeId = counter;
        counter++;
    }

    // method to get name of employee
    public String getName() {
        return this.name;
    }

    // method to get base salary of employee
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // method to get employee id
    public int getEmployeeId() {
        return this.employeeId;
    }

    // method to get manager's name
    public Employee getManager() {
        return this.manager;
    }

    public void setManager(Employee e) {
        this.manager = e;
    }

    public boolean equals(Employee other) {
        if (this.employeeId == other.employeeId) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.employeeId + " " + this.name;
    }

    // abstract method to set employee status => different for different groups of employees
    public abstract String employeeStatus();
}

