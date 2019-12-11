/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public enum TransactionType {
    
    /**
     *The enum constant to put money into the account.
     */
    DEPOSIT,

    /**
     *The enum constant for transaction of type online purchase
     */
    ONLINEPURCHASE,

    /**
     *The enum constant for transaction of type withdrawal, i.e to take money from an account.
     */
    WITHDRAW;
}