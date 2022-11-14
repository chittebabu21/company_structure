package com.companystructure;

/*
 * Author : Chittebabu
 * Objective : SoftwareEngineer is the child class of TechnicalEmployee
 * Date : 11/11/2022
 */

public class SoftwareEngineer extends TechnicalEmployee {
    // initialize variables
    private boolean codeAccess = false;
    private int checkIns = 0;

    // constructor method
    public SoftwareEngineer(String name) {
        super(name);
    }

    // getter and setter methods
    public boolean getCodeAccess() {
        return codeAccess;
    }

    // setter
    public void setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;
    }

    public int getSuccessfulCheckIns() {
        return checkIns;
    }

    public boolean checkInCode() {
        TechnicalLead manager = (TechnicalLead) this.getManager(); // cast this.method as TechnicalLead
        if (manager.approveCheckIn(this)) {
            checkIns++;
            return true;
        }
        return false;
    }

    @Override
    public String employeeStatus() {
        return getEmployeeId() + " " + getName() + " has " + this.checkIns + " successful check-ins";
    }
}
