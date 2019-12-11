/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public abstract class Employee {
    private String fName;
    private String lName;
    private String SSN;

    public Employee(String fName, String lName, String SSN) {
        this.fName = fName;
        this.lName = lName;
        this.SSN = SSN;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "Employee{" + "fName=" + fName + ", lName=" + lName + ", SSN=" + SSN + '}';
    }
    
    public abstract double estimatedSalary();
    
    
}
