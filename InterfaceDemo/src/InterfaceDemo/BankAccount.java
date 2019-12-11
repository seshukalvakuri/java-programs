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
public abstract class BankAccount implements Accountable1{
    private int accNo;
    private String accType;
    private double currentBalance;

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BankAccount(int accNo, String accType,double currentBalance) {
        this.accNo = accNo;
        this.accType = accType;
        this.currentBalance = currentBalance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accNo=" + accNo + ", accType=" + accType + '}';
    }

   
    
}
