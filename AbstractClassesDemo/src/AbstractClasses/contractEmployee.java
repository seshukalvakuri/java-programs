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
public abstract class contractEmployee extends Employee {
    private int contractMonthsWorked;

    public contractEmployee(String fName, String lName, String SSN,int contractMonthsWorked) {
        super(fName, lName, SSN);
        this.contractMonthsWorked = contractMonthsWorked;
    }

    public int getContractMonthsWorked() {
        return contractMonthsWorked;
    }

    public void setContractMonthsWorked(int contractMonthsWorked) {
        this.contractMonthsWorked = contractMonthsWorked;
    }

    @Override
    public String toString() {
        return super.toString()+" "+contractMonthsWorked;
    }
    
    
    
}
