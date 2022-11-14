package com.companystructure;

/*
 * Author : Chittebabu
 * Objective : TechnicalLead is the child class of TechnicalEmployee and manager for SoftwareEngineer
 * Date : 11/11/2022
 */

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    // initialize variables
    private int headCount = 4;
    private double baseSalary = 0d;
    private int totalCheckIns = 0;
    private ArrayList<SoftwareEngineer> team = new ArrayList<>(); // initialise empty array-list

    // constructor method
    public TechnicalLead(String name) {
        super(name);
        this.baseSalary = 1.3 * this.getBaseSalary();
    }

    public boolean hasHeadCount() {
        if (team.size() < headCount) {
            return true;
        }
        return false;
    }

    // method to add report
    public boolean addReport(SoftwareEngineer s) {
        if (hasHeadCount()) {
            team.add(s);
            // s.setManager(this...) => additional method to be added
            return true;
        }
        return false;
    }

    // method to approve check-ins by SoftwareEngineer
    public boolean approveCheckIn(SoftwareEngineer s) {
        if (team.contains(s) && s.getCodeAccess()) {
            this.totalCheckIns++;
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus) {

        return false;
    }

    // additional method to get salaries
    public double getSalaries() {
        double monies = 0d;
        return monies;
    }

    public String getTeamStatus() {
        String message = this.getEmployeeId() + " " + this.getName() + " " + this.totalCheckIns + " successful check-ins";
        return message;
    }
}
