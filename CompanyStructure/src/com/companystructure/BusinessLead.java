package com.companystructure;

/*
 * Author : Chittebabu
 * Objective : BusinessLead is the child class of BusinessEmployee and manager for Accountant
 * Date : 11/11/2022
 */

import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    // initialize variables
    private double baseSalary = 0d;
    private int headCount = 10;
    private double bonusBudget = 0d;
    public ArrayList<Accountant> team = new ArrayList<>();

    // constructor method
    public BusinessLead(String name) {
        super(name);
    }

    public boolean hasHeadCount() {
        if (team.size() < headCount) {
            return true;
        }
        return false;
    }

    public boolean addReport(Accountant a, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            this.team.add(a);
            this.bonusBudget = this.bonusBudget + (a.getBaseSalary() + (a.getBaseSalary() * 0.10));
            a.supportTeam(supportTeam);
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (bonus < this.bonusBudget) {
            this.bonusBudget = this.bonusBudget - bonus;
            return true;
        }
        return false;
    }

    public boolean approveBonus(Employee e, double bonus) {
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getTeamSupported().getName() == e.getManager().getName()) {
                if (team.get(i).approveBonus(bonus)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getTeamStatus() {
        return this.headCount + " staffs report to " + getName();
    }

    @Override
    public String employeeStatus() {
        return getEmployeeId() + " " + getName() + " with a budget of 22500.0";
    }
}
