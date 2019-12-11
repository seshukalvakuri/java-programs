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
public class SalariedEmployee extends hourlyEmployee{
    
    public SalariedEmployee(int ssn, String firstName, String lastName, int hours, double salary) {
        super(ssn, firstName, lastName, hours, salary);
        System.out.println("Insid salariedEmployee constructor");
    }
    @Override
    public double calcSalary(){
        System.out.println("Inside salariedemployee calcslary");
        return super.calcSalary();
    }
    @Override
    public String getFullName(){
        System.out.println("Inside salaied employee getfullName");
        return super.getFullName()+" "+super.getFullName();
    }
    @Override
    public String toString(){
        System.out.println("Inside SalariedEmployee toString");
        return super.toString()+" "+super.calcSalary();
    }
  }