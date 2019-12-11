/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import enums.TransactionType;
import exceptions.InsufficentFundsException;
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
public class SavingsAccountTest {
    
    /**
     *
     */
    public SavingsAccountTest() {
        
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
     * Test of generateStatement method, of class SavingsAccount.
     */
    @Test
    public void testGenerateStatement() {
        System.out.println("generateStatement");
        Customer customer = new Customer("Seshu", "Lakshmi", "11/12/1990");
        LocalDateTime date = LocalDateTime.of(2018, Month.DECEMBER, 01, 12, 12, 12);
        Transaction t1 = new Transaction(TransactionType.DEPOSIT, 100.0, date);
        SavingsAccount instance = new SavingsAccount(customer, 2651212, true);
        Transaction t2 = new Transaction(TransactionType.WITHDRAW, 10.0, date);
        instance.makeTransaction(t1);
        instance.makeTransaction(t2);
        String expResult = "Name:  Lakshmi, Seshu\nDate of Birth: 11/12/1990\nAccount Number: 2651212\nAccount Type: Savings Account\tInterest Rate: 5.80%\nTransaction Limit for withdrawal: 6 Transactions\n-------------------------------------------------------------------------------\nTransaction Type\tTransaction Time\tAmount\tAdditional Charges\tStatus\nDEPOSIT\t\t\t2018-12-01T12:12:12\t$100.00\t\t$0.00\t\tSUCCESS\nWITHDRAW\t\t2018-12-01T12:12:12\t$10.00\t\t$0.00\t\tSUCCESS\n-------------------------------------------------------------------------------\nCurrent Balance: 90.00\t\tInterest: $5.22";
        String result = instance.generateStatement();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNoofWithdrawals method, of class SavingsAccount.
     */
    @Test (expected = InsufficentFundsException.class)
    public void testGetNoofWithdrawals() {
        System.out.println("getNoofWithdrawals");
        Customer customer = new Customer("Seshu", "Lakshmi", "11/12/1990");
        LocalDateTime date = LocalDateTime.of(2017, Month.DECEMBER, 01, 12, 12, 12);
        Transaction t1 = new Transaction(TransactionType.WITHDRAW, 10.0, date);
        Transaction t2 = new Transaction(TransactionType.DEPOSIT, 10.0, date);
        SavingsAccount instance = new SavingsAccount(customer, 2651212, true);
        SavingsAccount instance1 = new SavingsAccount(customer, 2651212, true);
        int expResult = 0;
        instance.makeTransaction(t1);
        instance.makeTransaction(t2);
        int result = instance.getNoofWithdrawals();
        int result1 = instance1.getNoofWithdrawals();
        assertEquals(expResult, result);
        assertEquals(expResult, result1);
    }

    /**
     * Test of toString method, of class SavingsAccount.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer customer = new Customer("Seshu", "Lakshmi", "11/12/1990");
        LocalDateTime date = LocalDateTime.of(2018, Month.DECEMBER, 01, 12, 12, 12);
        Transaction t1 = new Transaction(TransactionType.WITHDRAW, 10.0, date);
        SavingsAccount instance = new SavingsAccount(customer, 2651212, true);
        String expResult = "Name:  Lakshmi, Seshu\nDate of Birth: 11/12/1990\nAccount Number: 2651212\nAccount Type: Savings Account\tInterest Rate: 5.80%";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of makeTransaction method, of class SavingsAccount.
     */
    @Test (expected = InsufficentFundsException.class)
    public void testMakeTransaction() {
        System.out.println("makeTransaction");
        Customer customer = new Customer("Lakshmi", "Seshu", "11/12/1990");
        LocalDateTime date = LocalDateTime.of(2018 , Month.DECEMBER, 01, 12, 12, 12);
        Transaction t1 = new Transaction(TransactionType.DEPOSIT, 100.0, date);
        Transaction t2 = new Transaction(TransactionType.WITHDRAW, 10.0, date);
        Transaction t3 = new Transaction(TransactionType.ONLINEPURCHASE, 70.0, date);
        Transaction t4 = new Transaction(TransactionType.ONLINEPURCHASE, 20.0, date);
        SavingsAccount instance = new SavingsAccount(customer, 2651212, true);
        double expResult = 100.0;
        double expResult1 = 90.0;
        double expResult2 = 18.010000000000005;
        double result = instance.makeTransaction(t1);
        double result1 = instance.makeTransaction(t2);
        double result2 = instance.makeTransaction(t3);
        instance.makeTransaction(t4);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult1, result1, 0.0);
        assertEquals(expResult2, result2, 0.0);
    }
    
}
