package com.companystructure;

/*
 * Author : Chittebabu
 * Objective : Accountant is the child class of BusinessEmployee
 * Date : 11/11/2022
 */

public class Accountant extends BusinessEmployee {
    // initialize variables
    public double bonusBudget = 0d;
    // constructor method
    public Accountant(String name) {
        super(name);
    }

    public TechnicalLead getTeamSupported() {
        return null;
    }

    public void supportTeam(TechnicalLead lead) {

    }

    public boolean approveBonus(double bonus) {
        if (bonus < this.bonusBudget) {
            this.bonusBudget -= bonus;
            return true;
        }
        return false;
    }

    public double getBonusBudget() {
        return this.bonusBudget;
    }

    @Override
    public String employeeStatus() {
        return getEmployeeId() + " " + getName() + " with a budget of 22500.0 is supporting " + this.getTeamSupported();
    }
}
