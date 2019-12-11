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
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/**        AbstractBankAccount bankAcc = new CheckingAccount();
 //1.   //bankAcc.getInfo();
        
        CheckingAccount acc = new StudentAccount();
 //2.   //acc.getStudentInfo();
        
 //3.       
        CheckingAccount checkAcc = new CheckingAccount();
        checkAcc.calculateInterest();
        
 //4.   //CheckingAccount checkAcc1 = new Payment();
        
//5.    //CashPayment cashPay = new AbstractAccountPayment();
        
 //6.   
        AbsractAccountPayment pay1 = new CreditCardPayment();
        CashPayment pay2 = new CashPayment();
        //pay2 = pay1;
        
//7.    
        AbsractAccountPayment pay3 =new CashPayment();
        pay3.
        
//8.    
        CheckingAccount checkingAcc = new CheckingAccount();
        //StudentAccount studentAcc = new StudentAccount();
        checkingAcc = studentAcc;
        studentAcc = checkingAcc;                                           //9
        studentAcc = (StudentAccount)checkingAcc;                          //10.
        
       
        checkingAcc = studentAcc;
//12.   studentAcc = checkingAcc; */
 CheckingAccount checkingAcc = new StudentAccount();                //11.
        StudentAccount studentAcc = new StudentAccount();
   studentAcc = (studentAcc)checkingAcc; 
        
//14.   
        AbsractAccountPayment pay1 = new CreditCardPayment();
        AbsractAccountPayment pay2 = new CashPayment();
        pay2 = (AbsractAccountPayment)pay1;
        
//15.
        AbstractBankAccount bank = new CheckingAccount();
        AbstractBankAccount bank1 = new StudentAccount();
        bank = bank1;
        
//16.   
        StudentAccount studentAcc = new StudentAccount();
        AbstractBankAccount bank2 = new CheckingAccount();
        studentAcc = (StudentAccount)bank;
//17.   studentAcc = (CheckingAccount)bank;          
        bank2 = studentAcc;                           //18.
        
//19.   AbstractBankAccount acc = new Payment();        
        
//20. 
        Payment payone = new CashPayment();
        
        
        
    }
    
}
