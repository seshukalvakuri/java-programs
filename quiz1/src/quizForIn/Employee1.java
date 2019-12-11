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
public class Employee1 {
    int ssn;
    private String firstName;
    private String lastName;

    public Employee1(int ssn, String firstName, String lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Inside Employee constructor");
    }

    public String getFirstName() {
        System.out.println("Inside Employee getfirstname");
        return firstName;
    }

    public String getLastName() {
        System.out.println("Inside Employee lastname");
        return lastName;
    }
    
    public String getFullName(){
        System.out.println("Inside employee getFullName");
        return firstName+" "+lastName; 
    }

    @Override
    public String toString() {
        System.out.println("Inside employee toString");
        return  ssn+" "+getFullName();
    }
    
}
