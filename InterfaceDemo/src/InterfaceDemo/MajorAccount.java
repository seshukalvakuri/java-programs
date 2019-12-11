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
public class MajorAccount extends BankAccount {
    
    public MajorAccount(int accNo, String accType,double currentBalance) {
        super(accNo, accType, currentBlance);
    }

    @Override
    public double calcInt() {
        return ((super.getCurrentBalance()*INTEREST_RATE*12)/100);
    }
    
    
}
