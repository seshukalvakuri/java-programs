/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import enums.TransactionType;
import java.time.LocalDateTime;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Transaction implements Comparable<Transaction>{

    /**
     * stores the amount for a transaction
     */
    public double amount;

    /**
     *stores the time and date of this transaction as LocalDateTime.
     */
    public LocalDateTime trannsactonTime;

    /**
     *stores Status of the transaction.
     */
    public String status;

    /**
     *stores any additional charges involved
     */
    public double additionalCharges;

    /**
     *stores the time and date of this transaction as LocalDateTime.
     */
    public TransactionType transactionType;

    /**
     *
     * @param transactionType stores the time and date of this transaction as LocalDateTime.
     * @param amount  stores the amount for a transaction
     * @param trannsactonTime  stores type of transaction as a TransactionType enum.
     */
    public Transaction(TransactionType transactionType, double amount, LocalDateTime trannsactonTime) {
        this.amount = amount;
        this.trannsactonTime = trannsactonTime;
        this.transactionType = transactionType;
    }

    /**
     *The setter method that sets the value os status.
     * @param status sets the value of status as string 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *The getter method that returns any additional charges added to the transaction
     * @param additionalCharges sets the additional value charges of type double.
     */
    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /**
     *The getter method that returns the amount of a transaction.
     * @return returns the amount in double.
     */
    public double getAmount() {
        return amount;
    }

    /**
     *The getter method that returns the type of transaction as TransactionType enum.
     * @return returns the type of transaction.
     */
    public LocalDateTime getTrannsactonTime() {
        return trannsactonTime;
    }

    /**
     *The getter method that returns the status of a transaction.
     * @return returns status of the transaction as a String.
     */
    public String getStatus() {
        return status;
    }

    /**
     *The getter method that returns any additional charges added to the transaction
     * @return returns the additional charges as double.
     */
    public double getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     *The getter method that returns the timestamp of a transaction.
     * @return returns the timestamp of a transaction as a LocalDateTime variable
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        if (transactionType == TransactionType.DEPOSIT) {
            return transactionType + "\t\t\t" + trannsactonTime + "\t$" + String.format("%.2f", amount) + "\t\t$" + String.format("%.2f", additionalCharges) + "\t\t" + status;
        } else {
            return transactionType + "\t\t" + trannsactonTime + "\t$" + String.format("%.2f", amount) + "\t\t$" + String.format("%.2f", additionalCharges) + "\t\t" + status;
        }
    }
    
      @Override
    public int compareTo(Transaction o) {
        return this.getTrannsactonTime().compareTo(o.getTrannsactonTime());
    }

}
