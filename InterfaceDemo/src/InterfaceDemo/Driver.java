/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDemo;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount acc1 = new MajorAccount(1234,"savings",1000);
        System.out.println(acc1.getCurrentBalance());
        System.out.println(acc1.calcInt());
    }
    
}
