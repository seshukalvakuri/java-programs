/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
import enums.TransactionType;
import exceptions.OverdraftLimitExceededException;
/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class CurrentAccount extends Account {

    /**
     *A two argument constructor that initializes the instance variables with the arguments passed.
     * @param customer stores the customer transactions.
     * @param accountNumber stores the account number of a customer.
     */
    public CurrentAccount(Customer customer, long accountNumber) {
        super(customer, accountNumber);
    }

    @Override
    public String generateStatement() {
        String l = "\n-------------------------------------------------------------------------------\n";
        String space = "";
        for (Transaction transaction : super.getTransactions()) {
            space += transaction.toString() + "\n";
        }
        String t = space.substring(0, space.length()-1);
        double balance;
        if(super.getBalance()<0){
            balance = 0;
        }else{
            balance = super.getBalance();
        }
        return toString() + l + "Transaction Type\tTransaction Time\tAmount\tAdditional Charges\tStatus\n" + t + l + "Current Balance: " + String.format("%.2f", balance) + "\nOverdraft usage: $" + String.format("%.2f", (OVERDRAFT_LIMIT - overDraft())) + "\t\tOverdraft available: $" + String.format("%.2f", overDraft());

    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Current Account\tOverdraft Limit: $500.00";
    }

    @Override
    public double makeTransaction(Transaction transaction){
        double balanceUpdate = 0.0;
        double availableBal = super.getBalance() + OVERDRAFT_LIMIT;
        if (availableBal >= transaction.getAmount()) {
            if (transaction.getTransactionType() == TransactionType.DEPOSIT) {
                transaction.setAdditionalCharges(0.0);
                transaction.setStatus("SUCCESS");
                balanceUpdate = super.getBalance() + transaction.getAmount();
                transactions.add(transaction);
            } else if (transaction.getTransactionType() == TransactionType.ONLINEPURCHASE) {
                transaction.setAdditionalCharges(1.59);
                transaction.setStatus("SUCCESS");
                balanceUpdate = super.getBalance() - (transaction.getAmount() + transaction.getAdditionalCharges());
                transactions.add(transaction);
            } else {
                transaction.setAdditionalCharges(0.0);
                transaction.setStatus("SUCCESS");
                balanceUpdate = super.getBalance() - transaction.getAmount();
                transactions.add(transaction);
            }
        } else {
            if (transaction.getTransactionType() == TransactionType.DEPOSIT) {
                transaction.setAdditionalCharges(0.0);
                transaction.setStatus("SUCCESS");
                balanceUpdate = super.getBalance() + transaction.getAmount();
                transactions.add(transaction);
            } else {
                transaction.setAdditionalCharges(0.0);
                transaction.setStatus("FAILED");
                balanceUpdate = super.getBalance();
                transactions.add(transaction);
                throw new OverdraftLimitExceededException();
            }
        }
        super.setBalance(balanceUpdate);
        return balanceUpdate;
    }

    public double overDraft() {
        if (super.getBalance() < 0) {
            return super.getBalance() + OVERDRAFT_LIMIT;
        } else {
            return OVERDRAFT_LIMIT;
        }
    }
}