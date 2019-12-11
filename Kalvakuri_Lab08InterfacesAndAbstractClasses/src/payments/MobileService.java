/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

import accounts.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public abstract class MobileService implements Operations{
   ConnectionAccount account;
    double balance;
    double dataAvailable;

    /**
     *<p>This is Mobile Service constructor.</p>
     * @param account of connection Account data type
     * @param balance of double data type
     * @param dataAvailable of double data type.
     */
    public MobileService(ConnectionAccount account, double balance, double dataAvailable) {
        this.account = account;
        this.balance = balance;
        this.dataAvailable = dataAvailable;
    }

    /**
     *<p>This is a getter account of connection Account</p>
     * @return returns account
     */
    public ConnectionAccount getAccount() {
        return account;
    }

    /**
     *<p> This is getter account of balance</p>
     * @return returns balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *<p>This is a getter Data Available method.</p>
     * @return returns data Available
     */
    public double getDataAvailable() {
        
        return dataAvailable;
    }

    /**
     *<p>This abstract can make call method</p>
     * @return returns boolean type
     */
    @Override
   public abstract boolean canMakeCall();
       
    /**
     *This is a use data boolean method with data used arguments.
     * @param used
     * @return  returns the updated amount of data available.
     */
    public boolean useData(double used){
            double data = used/1024;
            if(data<this.dataAvailable){
                this.dataAvailable -= data;
                return true;
            }
        return false;
    }

    /**
     *<p>This is abstract method named makeCall with call arguments</p>
     * @param call
     * @return nothing
     */
    @Override
    public abstract boolean makeCall(Call call);
 
    @Override
    public String toString() {
       SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
        String myString = "";
        if ("postpaid".equals(account.getConnectionType())) {
            try {
                myString = "Customer Name\t:" + account.getCustomerName()
                        + "\nPhone Number\t:" + account.getPhoneNumber()
                        + "\nConnection Type\t:" + account.getConnectionType()
                        + "\tConnection Date :" + format.format(new SimpleDateFormat("MM/dd/yyyy").parse(account.getJoiningDate()));
            } catch (ParseException e) {
                Logger.getLogger(MobileService.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            myString = "Customer Name\t:" + account.getCustomerName()
                    + "\nPhone Number\t:" + account.getPhoneNumber()
                    + "\nConnection Type\t:" + account.getConnectionType();
        }
        return myString;
    }
                   
    }
    
    
    
    

