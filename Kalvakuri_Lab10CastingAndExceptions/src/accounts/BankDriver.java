/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
import enums.TransactionType;
import exceptions.InsufficentFundsException;
import exceptions.MaxTransactionsException;
import exceptions.OverdraftLimitExceededException;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException
     */
     public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(new File("input.txt"));
        String space = "";
        SavingsAccount savings = null;
        CurrentAccount current = null;
        String accountType = sc.nextLine();
        while (sc.hasNext()) {
            if (!space.isEmpty()) {
                accountType = space;
            }
            String cNames = sc.nextLine();
            String[] names = cNames.split(" ");
            System.out.println("------------------------------------------------------------");
            System.out.println("Name of the customer: " + names[0] + "  " + names[1]);
            System.out.println("------------------------------------------------------------");
            String dob = sc.nextLine();
            Customer customer = new Customer(names[0], names[1], dob);
            long accountNumber = sc.nextLong();
            sc.nextLine();
            if (accountType.equals("savings")) {
                boolean hasWithdrawlLimits = sc.nextBoolean();
                savings = new SavingsAccount(customer, accountNumber, hasWithdrawlLimits);
                sc.nextLine();
            } else {
                current = new CurrentAccount(customer, accountNumber);
            }
            space = sc.nextLine();
            do {
                String tInformation = space;
                String[] transactionInfoSplit = tInformation.split(" ");
                TransactionType type;
                switch (transactionInfoSplit[0]) {
                    case "DEPOSIT":
                        type = TransactionType.DEPOSIT;
                        break;
                    case "WITHDRAW":
                        type = TransactionType.WITHDRAW;
                        break;
                    case "ONLINEPURCHASE":
                        type = TransactionType.ONLINEPURCHASE;
                        break;
                    default:
                        type = TransactionType.DEPOSIT;
                        break;
                }
                
                String[] date = transactionInfoSplit[2].split("-");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);
                int day = Integer.parseInt(date[2]);
                String[] time = transactionInfoSplit[3].split(":");
                int hour = Integer.parseInt(time[0]);
                int mins = Integer.parseInt(time[1]);
                int sec = Integer.parseInt(time[2]);
                LocalDateTime dates = LocalDateTime.of(year, month, day, hour, mins, sec);
                Transaction transactions = new Transaction(type, Double.parseDouble(transactionInfoSplit[1]), dates);
                try{
                    if (accountType.equals("savings")) {
                    savings.makeTransaction(transactions);
                    System.out.println("The balance after " + type + " in dollars is " + String.format("%.2f", savings.getBalance()));
                } else {
                    current.makeTransaction(transactions);
                    System.out.println("The balance after " + type + " in dollars is " + String.format("%.2f", current.getBalance()));
                }
                }
                catch(OverdraftLimitExceededException ex){
                    System.out.println("Exceeded overdraft limit. Avaiable funds including overdraft: " + String.format("%.2f", current.overDraft()));
                    
                }
                catch(MaxTransactionsException ex){
                    System.out.println("Exceeded number of withdrawals transactions. Number of available withdrawals per month: 6");
                }
                catch(InsufficentFundsException ex){
                    System.out.println("Insufficent funds. Available funds: " + savings.getBalance());
                }
                if (sc.hasNext()) {
                    space = sc.nextLine();
                } else {
                    break;
                }
            } while (space.contains("DEPOSIT") || space.contains("WITHDRAW") || space.contains("ONLINEPURCHASE"));
            if (accountType.equals("savings")) {
                accounts.add(savings);
            } else {
                accounts.add(current);
            }
        }
        System.out.println("************************************************************************\n"
                + "*********Invoke getNoofWithdrawals() on SavingsAccount objects**********\n"
                + "************************************************************************");
        for(Account account: accounts){
            if(account.toString().contains("Savings")){
                SavingsAccount savingsAccount = (SavingsAccount) account;
                System.out.println(account.getCustomer().getFirstName() +" made " + savingsAccount.getNoofWithdrawals()+  " withdrawals in this month.");
            }
        }
        System.out.println("***********************************************************************\n"
                + "****Invoke generateStatement() on all objects in accounts ArrayList****\n"
                + "************************************************************************");
        for (Account a : accounts) {
            System.out.println(a.generateStatement());
            System.out.println("*******************************************************************************");
        }
        System.out.println("*************************Sort on account number*************************\n"
                + "************************************************************************");
        Collections.sort(accounts);
        String limit = "";
        for (Account account : accounts) {
            if (account.toString().contains("Savings")) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                System.out.println(savingsAccount.toString());
                if (savingsAccount.hasLimitedWithdrawals == true) {
                    limit = "6 Transactions";
                } else {
                    limit = "No limit";
                }
                System.out.println("Transaction Limit for withdrawal: " + limit +"\n-----------------------------------------------------------------------");
            } else {
                CurrentAccount currentAccount = (CurrentAccount) account;
                System.out.println(currentAccount.toString());
                System.out.println("-----------------------------------------------------------------------");

            }
        }
        System.out.println("************************************************************************\n"
                + "*******************Sort on Transaction Time ****************************\n"
                + "************************************************************************");
        for (Account account : accounts) {
            Collections.sort(account.getTransactions());
            String str = account.generateStatement().replace("-------------------------------------------------------------------------------\nTransaction Type\tTransaction Time\tAmount\tAdditional Charges\tStatus\n", "");
            System.out.println(str.substring(0, str.indexOf("\nCurrent Balance")).replace("-------------------------------------------------------------------------------", "-----------------------------------------------------------------------"));
        }
        System.out.println("************************************************************************\n"
                + "************* Sort on Transaction Type& Transaction time ***************\n"
                + "************************************************************************");
        for (Account account : accounts) {
            Collections.sort(account.getTransactions(), new Comparator<Transaction>() {
                @Override
                public int compare(Transaction o1, Transaction o2) {
                    if (o1.getTransactionType().compareTo(o2.getTransactionType()) == 0) {
                        return o1.getTrannsactonTime().compareTo(o2.getTrannsactonTime());
                    } else {
                        return o1.getTransactionType().compareTo(o2.getTransactionType());
                    }
                }
            });
            String str = account.generateStatement().replace("-------------------------------------------------------------------------------\nTransaction Type\tTransaction Time\tAmount\tAdditional Charges\tStatus\n", "");
            System.out.println(str.substring(0, str.indexOf("\nCurrent Balance")).replace("-------------------------------------------------------------------------------", "-----------------------------------------------------------------------"));
        }
        System.out.println("************************************************************************\n"
                + "*************** Sort Accounts based on account balance *****************\n"
                + "************************************************************************");
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.getBalance(), o2.getBalance());
            }
        });
        for (Account account : accounts) {
            if (account.toString().contains("Savings")) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                System.out.println(account.toString() + "\nTransaction Limit for withdrawal: 6 Transactions" + "\nBalance: " + String.format("%.2f", account.getBalance()) + "\n-----------------------------------------------------------------------");
            } else {
                System.out.println(account.toString() + "\nBalance: " + String.format("%.2f", account.getBalance()) + "\n-----------------------------------------------------------------------");
            }
        }
         System.out.println("-----------------------------------------------------------------------\n" +
"-------Overrided equals and hashCode methods------");
         System.out.println("Your inference from test cases for equals()");
        System.out.println("Equals method checks whether the calling object values are identical compare to the parameter object.");
         System.out.println("-----------------------------------------------------------------------------------------------------\n");
         System.out.println("Your inference from test cases for hashcode()");
        System.out.println(" Hash method generates hash code for each object. If the values of two objects are same it does generate same hash code value.");
         System.out.println("--------------------------------------------------------------------------------------------------------\n");
         System.out.println("Is all your test cases for equals() passed the tests or not. If not why???");
        System.out.println("All test cases are passed, but it fails when the calling object values and parameter values are different.");
         System.out.println("------------------------------------------------------------------------------------------------------\n");
         System.out.println("Is all your test cases for hashcode() passed the tests or not. If not why???");
        System.out.println(" All test cases are passed, but it fails when the calling object values and parameter values are different while using Equals method.");
    }

}
