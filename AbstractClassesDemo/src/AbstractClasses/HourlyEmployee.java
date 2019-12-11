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
public class HourlyEmployee extends Employee{
    private int hrsWorked;
    private double wageRate;

    public HourlyEmployee(String fName, String lName, String SSN,int hrsWorked,double wageRate) {
        super(fName, lName, SSN);
        this.hrsWorked = hrsWorked;
        this.wageRate = wageRate;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    @Override
    public String toString() {
        return super.toString()+estimatedSalary();
    }

    @Override
    public double estimatedSalary() {
       return hrsWorked*wageRate;
    }
    
    
}
