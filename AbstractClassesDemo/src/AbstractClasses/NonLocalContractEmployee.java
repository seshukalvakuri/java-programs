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
public class NonLocalContractEmployee extends contractEmployee{

    private double taxRate;
    private String visaType;

    public NonLocalContractEmployee(String fName, String lName, String SSN,String visaType, int contractMonthsWorked,double taxRate) {
        super(fName, lName, SSN, contractMonthsWorked);
        this.taxRate = taxRate;
        this.visaType = visaType;
    }

   
    
    
    @Override
    public double estimatedSalary() {
        double returnValue = 0.0;
        if(visaType.equals("h1")||visaType.equals("H1")){
        returnValue = 1000-(1000*taxRate)-200;
        }
        return returnValue;
        }
    
    //public boolean isCold(){
    //if(double)
    //}
    
    
    
    
}
