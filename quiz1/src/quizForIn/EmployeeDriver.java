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
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee1 emp = new Employee1(1234,"Ajay","Bandi");
        System.out.println(emp);
        System.out.println("______________________________________________");
        
        hourlyEmployee hrEmp = new hourlyEmployee(1234,"Joe","Williams",12,10.0);
        System.out.println(hrEmp);
        System.out.println("________________________________________________");
        
        SalariedEmployee salEmp = new SalariedEmployee(4357,"Bob","Williams",20,10.0);
        System.out.println(salEmp);
        System.out.println("_________________________________________________");
        
        hourlyEmployee hrEmp1 = new SalariedEmployee(4357,"kaite","Williams",20,3);
        System.out.println(hrEmp1);
    }
    
}
