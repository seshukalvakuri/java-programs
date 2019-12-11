/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import interfaces.Operations;
import java.util.ArrayList;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public abstract class Account implements Operations,Comparable<Account>{

    /**
     *this stores the account number of a customer.
     */
    public long accountNumber;

    /**
     *this stores the account balance of a customer.
     */
    public double balance;

    /**
     *stores the details of a customer as a Customer object.
     */
    public Customer customer;

    /**
     *stores details of all the transactions performed by a customer.

     */
    public ArrayList<Transaction> transactions;

    /**
     *A two argument constructor that initializes the variables using parameters passed
     * @param customer stores details of all the transactions performed by a customer.
     * @param accountNumber stores the account balance of a customer.
     */
    public Account(Customer customer, long accountNumber) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
        this.transactions = new ArrayList<Transaction>();
    }

    /**
     *The getter method that returns the account number.
     * @return returns the number of account as a long value.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     *The getter method that returns the balance of an account.
     * @return returns the balance of an account as a double
     */
    public double getBalance() {
        return balance;
    }

    /**
     *The setter method that sets the balance of an account.
     * @param balance sets the double valued balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    /**
     *The getter method that returns the Customer object associated with this account.
     * @return returns the Customer object containing details of a customer.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     *This getter method returns all the transactions made by an account as an ArrayList.
     * @return returns the transactions as an ArrayList.
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    
    /**
     *this is a abstract method taking transaction as a parmeter .
     * @param transaction stores the transactions of type transaction
     * @return returns the final balance of an account.
    
     */
    public abstract double makeTransaction(Transaction transaction);
        
    /**
     *This method generates the statement for an account in a specified format
     * @return returns the statement as a string. 
     */
    public String generateStatement(){
        return toString(); 
    }

    @Override
    public String toString() {
        return customer.toString() + "\nAccount Number: " + accountNumber;
    }
    
    @Override
    public int compareTo(Account o){
        return Long.compare(this.accountNumber, o.getAccountNumber());
    }
    
}
