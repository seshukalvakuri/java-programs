/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class CheckingAccount extends AbstractBankAccount implements Payment{
    private int routingNumber;
    
    public String getInfo(){
    String a = null;
    return a;
    }

    @Override
    public String accountDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double paymentDue(){
    double a=0.0;
    return a;
    }
}
