/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import enums.TransactionType;
import exceptions.InsufficentFundsException;
import exceptions.MaxTransactionsException;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class SavingsAccount extends Account {

    /**
     *An attribute that stores a boolean flag to determine if there is a limit on number of withdrawals within a month.
     */
    public boolean hasLimitedWithdrawals;

    /**
     *
     * @param customer an object containing the details of the customer
     * @param accountNumber account number of the savings account
     * @param hasLimitedWithdrawals boolean flag to determine withdrawal limit
     */
    public SavingsAccount(Customer customer, long accountNumber, boolean hasLimitedWithdrawals) {
        super(customer, accountNumber);
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
    }

    @Override
    public String generateStatement() {
        String l;
        if (hasLimitedWithdrawals == true) {
            l = "6 Transactions";
        } else {
            l = "No limit";
        }
        String line = "\n-------------------------------------------------------------------------------\n";
        String space = "";
        for (Transaction t1 : super.getTransactions()) {
            space += t1.toString() + "\n";
        }
        String transactionss = space.substring(0, space.length() - 1);
        return toString() + "\nTransaction Limit for withdrawal: " + l + line + "Transaction Type\tTransaction Time\tAmount\tAdditional Charges\tStatus\n" + transactionss + line + "Current Balance: " + String.format("%.2f", super.getBalance()) + "\t\tInterest: $" + String.format("%.2f", interestCalculator());
    }

    /**
     *This method returns the number of withdrawal transactions made by a customer
     * @return the number of withdrawals within the current month
     */
    public int getNoofWithdrawals() {
        int numWithdrawls = 0;
        LocalDateTime nowDate = LocalDateTime.now();
        Month presentMonth = nowDate.getMonth();
        int currentYear = nowDate.getYear();
        for (Transaction t : super.getTransactions()) {
            if (t.getTrannsactonTime().getMonth() == presentMonth && t.getTrannsactonTime().getYear() == currentYear) {
                if (t.getTransactionType() == TransactionType.WITHDRAW) {
                    numWithdrawls+=1;
                }
            }
        }
        return numWithdrawls;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Savings Account\tInterest Rate: "+String.format("%.2f",SAVING_INTEREST)+"%";
    }

    @Override
    public double makeTransaction(Transaction transaction){
        double balanceUpdated = 0.0;
        if (transaction.getTransactionType() == TransactionType.DEPOSIT) {
            transaction.setAdditionalCharges(0.0);
            transaction.setStatus("SUCCESS");
            balanceUpdated = super.getBalance() + transaction.getAmount();
            transactions.add(transaction);
        } else if (transaction.getTransactionType() == TransactionType.ONLINEPURCHASE) {
            if (transaction.getAmount() < super.getBalance()) {
                transaction.setAdditionalCharges(1.99);
                transaction.setStatus("SUCCESS");
                balanceUpdated = super.getBalance() - (transaction.getAmount() + transaction.getAdditionalCharges());
                transactions.add(transaction);
            } else {
                transaction.setAdditionalCharges(0.0);
                transaction.setStatus("FAILED");
                balanceUpdated = super.getBalance();
                transactions.add(transaction);
                throw new InsufficentFundsException();
            }
        } else {
            if (transaction.getAmount() <= super.getBalance() && hasLimitedWithdrawals == false) {
                if (getNoofWithdrawals() <= 6) {
                    transaction.setAdditionalCharges(0.0);
                    transaction.setStatus("SUCCESS");
                    balanceUpdated = super.getBalance() - transaction.getAmount();
                    transactions.add(transaction);
                } else if (getNoofWithdrawals() > 6) {
                    if (0.01 * transaction.getAmount() >= 2.59) {
                        transaction.setAdditionalCharges(0.01 * transaction.getAmount());
                    } else {
                        transaction.setAdditionalCharges(2.59);
                    }
                    transaction.setStatus("SUCCESS");
                    balanceUpdated = super.getBalance() - (transaction.getAmount() + transaction.getAdditionalCharges());
                    transactions.add(transaction);
                }
            } else if (transaction.getAmount() <= super.getBalance() && hasLimitedWithdrawals == true) {
                if (getNoofWithdrawals() <= 5) {
                    transaction.setAdditionalCharges(0.0);
                    transaction.setStatus("SUCCESS");
                    balanceUpdated = super.getBalance() - transaction.getAmount();
                    transactions.add(transaction);
                } else if (getNoofWithdrawals() > 5) {
                    transaction.setAdditionalCharges(0.0);
                    transaction.setStatus("FAILED");
                    balanceUpdated = super.getBalance();
                    transactions.add(transaction);
                    throw new MaxTransactionsException();
                }
            } else if (transaction.getAmount() > super.getBalance()) {
                transaction.setAdditionalCharges(0.0);
                transaction.setStatus("FAILED");
                balanceUpdated = super.getBalance();
                transactions.add(transaction);
                throw new InsufficentFundsException();
            }
        }
        super.setBalance(balanceUpdated);
        return balanceUpdated;
    }

    private double interestCalculator() {
        return super.getBalance() * (SAVING_INTEREST / 100);
    }
}
