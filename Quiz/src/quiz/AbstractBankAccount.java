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
public abstract class AbstractBankAccount implements Account {
    private int accountNo;
    private double balance;

   
  public abstract String accountDetails();
  
  public void accountInformation(){
  }
   
}
