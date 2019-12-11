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
public class LocalContractEmployee extends contractEmployee {
    
    private double taxRate;

    public LocalContractEmployee( String fName, String lName, String SSN, int contractMonthsWorked,double taxRate) {
        super(fName, lName, SSN, contractMonthsWorked);
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double estimatedSalary() {
        return 1000*(1000-taxRate);
    }

   
    
    }