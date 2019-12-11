/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import accounts.Transaction;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public interface Operations {

    /**
     *A constant that holds the overdraft limit provided for a checking account customer.
     */
    public static final double OVERDRAFT_LIMIT = 500.00;

    /**
     *A constant that holds the percentage of interest for a savings account.

     */
    public static final double SAVING_INTEREST = 5.8;
    
    /**
     *The abstract method takes a Transaction.
     * @param transaction stores the type of trasaction.
     * @return returns the final balance of the account after making transaction.
     */
    double makeTransaction(Transaction transaction);
    
    /**
     *This method generates the statement for an account in a specified format. 
     * @return returns the statement as a string
     */
    String generateStatement();
}
