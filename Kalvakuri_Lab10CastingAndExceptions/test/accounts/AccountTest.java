 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kalvakuri, Lakshmi Seshu
 */
public class AccountTest {
    
 
    /**
     * Test of hashCode method, of class Account.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Customer cust2 = new Customer("Lakshmi","Seshu","11/29/1996");
        long num = 2429567739L;
        Account inst = new CurrentAccount(cust2,num);
        int expRes = 460332449;
        int res = inst.hashCode();
        System.out.println(res);
        assertEquals(expRes, res);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //-865379112
        //-865379113
    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Customer customer1 = new Customer("Lakshmi","Seshu","11/29/1996");
        Customer cust2 = new Customer("abc","Seshu","11/29/1996");
        long num = 2429567739L;
        Account obj = new CurrentAccount(customer1,num) ;
        Account inst = new CurrentAccount(cust2,num);
        boolean expRes = false;
        boolean res = inst.equals(obj);
        assertEquals(expRes, res);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

 
}