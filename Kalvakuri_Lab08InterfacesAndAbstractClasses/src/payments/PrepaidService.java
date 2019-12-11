/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

import accounts.ConnectionAccount;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rates.*;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class PrepaidService extends MobileService implements Billing,Operations{ 
    
    private Call call;
    
    /**
     *This is a prepaid service constructor
     * @param account connectionAccount type 
     * @param balance double type
     * @param dataAvailable double type
     */
    public PrepaidService(ConnectionAccount account, double balance, double dataAvailable) {
        super(account, balance, dataAvailable);
    }

    /**
     *
     * @return
     */
    @Override
    public double calcBill(){
        
        double m = 0;
        try {
            m = call.getSeconds() / 60;
        } catch (ParseException e) {
            Logger.getLogger(PrepaidService.class.getName()).log(Level.SEVERE, null, e);
        }
        
            Tarrif calltype = call.getCallType();
            switch (calltype) {
                case LOCAL:
                    return m * (Tarrif.LOCAL.getPrepaid() / 100);
                case INTERNATIONAL:
                    return m * (Tarrif.INTERNATIONAL.getPrepaid() / 100);
                case ROAMING:
                    return m * (Tarrif.ROAMING.getPrepaid() / 100);
            }
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean canMakeCall(){
        if(super.getBalance()>0){
             return true;
        }
       return false;
    }

    /**
     *This is a discount For returning customer
     * @return 0
     */
    @Override
    public double discountForReturningCustomer(){
        return 0;
    }

    /**
     *This method take Call object as input and verifies if they can make a call using canMakeCall
     * @param call
     * @return true makes a call
     */
    @Override
    public boolean makeCall(Call call){
        if(canMakeCall()==true){
            this.call = call;
            
        }
        return true;
    }

     @Override
    public String toString() {
        
        String phn = "Phone number\t\tFrom\t\t\tTo\t\tCall Type";
        String s="-----------------------------------------------------------------------------";
        return s+"\n"+super.toString()+"\n"+s+"\nLast Call Details:"+
                "\n"+phn+
                "\n"+call+
                "\n"+s+
                "\n\tAvailable mobile data\t:"+String.format("%.2f",Math.abs(super.getDataAvailable()))+
                "MB\n\tBalance\t\t\t:$"+String.format("%.2f",(super.getBalance()-this.calcBill()))+
                "\n\tLast Call Amount\t:$"+String.format("%.2f",this.calcBill())+"\n"+s;
    }

       
    
}
