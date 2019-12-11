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
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new HourlyEmployee("A","B","123",20,7.0);
        System.out.println(emp.toString());
        
        Employee emp1 = new LocalContractEmployee("W","B","2345",12,7.0);
        System.out.println(emp1.estimatedSalary());
        
    }
}
