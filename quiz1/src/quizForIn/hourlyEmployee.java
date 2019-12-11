/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizForIn;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class hourlyEmployee extends Employee1{
    private int hrsWorked;
    private double salary;
    
    public hourlyEmployee(int ssn, String firstName, String lastName,int hours,double salary) {
        super(ssn, firstName, lastName);
        this.hrsWorked=hours;
        this.salary=salary;
        System.out.println("Inside HourlyEmployee constructor");
    }
    public String getFullName(){
        System.out.println("Inside hourlyEmployee getFullName");
        return super.getLastName()+","+super.getFirstName();
    }
    public double calcSalary(){
        System.out.println("Inside HourlyEmployee calcSalary");
        return hrsWorked*salary;
    }
    @Override
    public String toString(){
        System.out.println("Inside HourlyEmployee toString");
        return super.toString()+" "+calcSalary();
    }
    
}
