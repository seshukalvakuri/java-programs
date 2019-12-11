/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("This runs before we start testing");
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
        System.out.println("This runs after we finish testing everything");
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        System.out.println("This runs before we test each method");
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
        System.out.println("This runs after we finish testing each method");
    }

    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Customer instance = new Customer("Lakshmi", "Kalvakuri", "06/05/1996");
        Customer instance1 = new Customer("LakshmiS", "KalvakuriS", "06/05/1997");
        String expResult = "Lakshmi";
        String expResult1 = "LakshmiS";
        String result = instance.getFirstName();
        String result1 = instance1.getFirstName();
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = new Customer("Lakshmi", "Kalvakuri", "06/05/1996");
        Customer instance1 = new Customer("LakshmiS", "KalvakuriS", "06/05/1997");
        String expResult = "Kalvakuri";
        String expResult1 = "KalvakuriS";
        String result = instance.getLastName();
        String result1 = instance1.getLastName();
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getDob method, of class Customer.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
       Customer instance = new Customer("Lakshmi", "Kalvakuri", "06/05/1996");
        Customer instance1 = new Customer("LakshmiS", "KalvakuriS", "06/05/1997");
        String expResult = "06/05/1996";
        String expResult1 = "06/05/1997";
        String result = instance.getDob();
        String result1 = instance1.getDob();
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);   
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
       Customer instance = new Customer("Lakshmi", "Kalvakuri", "06/05/1996");
        Customer instance1 = new Customer("LakshmiS", "KalvakuriS", "06/05/1997");
        String expResult = "Name:  Kalvakuri, Lakshmi\nDate of Birth: 06/05/1996";
        String expResult1 = "Name:  KalvakuriS, LakshmiS\nDate of Birth: 06/05/1997";
        String result = instance.toString();
        String result1 = instance1.toString();
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);
    }
    
}
