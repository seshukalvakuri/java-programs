/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import enums.TransactionType;
import java.time.LocalDateTime;
import java.time.Month;
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
public class TransactionTest {
    
    /**
     *
     */
    public TransactionTest() {
    }
    
    /**
     *
     */
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
     * Test of getAmount method, of class Transaction.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Transaction instance = new Transaction(TransactionType.DEPOSIT, 20.0, LocalDateTime.now());
        double expResult = 20.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTransactonTime method, of class Transaction.
     */
    @Test
    public void testGetTransactonTime() {
        System.out.println("getTransactonTime");
        LocalDateTime date = LocalDateTime.of(2018, Month.NOVEMBER, 11, 12, 12, 12);
        Transaction instance = new Transaction(TransactionType.DEPOSIT, 20.0, date);
        LocalDateTime expResult = date;
        LocalDateTime result = instance.getTrannsactonTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Transaction.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Transaction instance = new Transaction(TransactionType.DEPOSIT, 20.0, LocalDateTime.now());
        instance.setStatus("SUCCESS");
        String expResult = "SUCCESS";
        String result = instance.getStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAdditionalCharges method, of class Transaction.
     */
    @Test
    public void testGetAdditionalCharges() {
        System.out.println("getAdditionalCharges");
        Transaction instance = new Transaction(TransactionType.DEPOSIT, 20.0, LocalDateTime.now());
        instance.setAdditionalCharges(2.0);
        double expResult = 2.0;
        double result = instance.getAdditionalCharges();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getTransactionType method, of class Transaction.
     */
    @Test
    public void testGetTransactionType() {
        System.out.println("getTransactionType");
        Transaction instance = new Transaction(TransactionType.DEPOSIT, 20.0, LocalDateTime.now());
        TransactionType expResult = TransactionType.DEPOSIT;
        TransactionType result = instance.getTransactionType();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Transaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LocalDateTime date = LocalDateTime.of(2018, Month.NOVEMBER, 11, 12, 12, 12);
        Transaction instance = new Transaction(TransactionType.DEPOSIT, 20.0, date);
        instance.setStatus("SUCCESS");
        instance.setAdditionalCharges(1.59);
        String expResult = "DEPOSIT\t\t\t2018-11-11T12:12:12\t$20.00\t\t$1.59\t\tSUCCESS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Transaction.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Transaction t = new Transaction(TransactionType.DEPOSIT, 20.0, LocalDateTime.now());
        LocalDateTime date = LocalDateTime.of(2018, Month.NOVEMBER, 11, 12, 12, 12);
        Transaction instance = new Transaction(TransactionType.ONLINEPURCHASE, 10.0, date);
        int expResult = 3;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Transaction.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Transaction instance = null;
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdditionalCharges method, of class Transaction.
     */
    @Test
    public void testSetAdditionalCharges() {
        System.out.println("setAdditionalCharges");
        double additionalCharges = 0.0;
        Transaction instance = null;
        instance.setAdditionalCharges(additionalCharges);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTrannsactonTime method, of class Transaction.
     */
    @Test
    public void testGetTrannsactonTime() {
        System.out.println("getTrannsactonTime");
        Transaction instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTrannsactonTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
