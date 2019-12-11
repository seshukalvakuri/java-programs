/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

import accounts.ConnectionAccount;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import rates.*;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class PostpaidService extends MobileService implements Billing, Operations {

    private ArrayList<Call> calls = new ArrayList<Call>();

    /**
     * <p>
     * This is post paid service method </p>
     *
     * @param account of connection account of data type
     * @param balance of double of data type.
     * @param dataAvailable double of data type.
     */
    public PostpaidService(ConnectionAccount account, double balance, double dataAvailable) {
        super(account, balance, dataAvailable);
        this.calls = calls;
    }

    /**
     * <p>
     * This is calc bill method</p>
     *
     * @return total cost for all calls and any additional data used
     */
    @Override
    public double calcBill() {

        double v = 0;
        double m = 0;
        double post;
        double afterUsed;
        for (Call call : calls) {
            try {
                m = call.getSeconds() / 60;
            } catch (ParseException e) {
                System.out.println(e);
            }
            Tarrif calltype = call.getCallType();
            switch (calltype) {
                case LOCAL:
                    post = m * (Tarrif.LOCAL.getPostpaid() / 100);
                    v = v + post;
                    break;
                case INTERNATIONAL:
                    post = m * (Tarrif.INTERNATIONAL.getPostpaid() / 100);
                    v = v + post;
                    break;
                case ROAMING:
                    post = m * (Tarrif.ROAMING.getPostpaid() / 100);
                    v = v + post;
                    break;
            }
        }

        if (super.getDataAvailable() < 0) {
            afterUsed = Math.abs(super.getDataAvailable()) * 0.05;
            return v = v + afterUsed;
        } else {
            return v;
        }

    }

    @Override
    public double discountForReturningCustomer() {
        int years = account.numberOfYears();
        if (years < 1) {
            return 0.0;
        }
        if (years >= 5) {
            return PostpaidDiscounts.YEAR5.getDiscount();
        }
        switch (years) {
            case 1:
                return PostpaidDiscounts.YEAR1.getDiscount();
            case 2:
                return PostpaidDiscounts.YEAR2.getDiscount();
            case 3:
                return PostpaidDiscounts.YEAR3.getDiscount();
            case 4:
                return PostpaidDiscounts.YEAR4.getDiscount();
        }
        return 0;
    }

    private double discountPrice() {
        return this.calcBill() * (this.discountForReturningCustomer() / 100);
    }

    /**
     * <P>
     * This is a final Bill after discount </p>
     *
     * @return discount on calculated bill and will return the final bill after
     * applying discount
     */
    public double finalBillAfterDiscount() {
        return this.calcBill() - this.discountPrice();
    }

    /**
     * <p>
     * This is canMake call method</p>
     *
     * @return true if the call has gone.
     */
    @Override
    public boolean canMakeCall() {
        return true;
    }

    @Override
    public boolean makeCall(Call call) {
        if (calls.isEmpty()) {
            calls.add(call);
            return true;

        } else {
            if (!calls.contains(call)) {
                calls.add(call);
                return true;
            }
            return false;
        }
    }

    @Override
    public String toString() {

        String number = "Phone number\t\tFrom\t\t\tTo\t\tCall Type";
        String s = "-----------------------------------------------------------------------------";
        String fString = "";
        for (Call ca : calls) {
            fString += ca + "\n";
        }
        return s + "\n" + super.toString() + "\n" + s + "\n" + number + "\n" + fString + "\n" + s
                + "\nAdditional mobile data used\t\t:" + String.format("%.2f", (this.getDataAvailable() > 0.0) ? 0.0 : Math.abs(super.getDataAvailable()))
                + "MB\nBill Amount\t\t\t\t:$" + String.format("%.2f", this.calcBill())
                + "\nReturning Customer Discount(" + String.format("%.2f", this.discountForReturningCustomer()) + "%)\t:$" + String.format("%.2f", this.discountPrice())
                + "\nFinal Bill Amount\t\t\t:$" + String.format("%.2f", this.finalBillAfterDiscount()) + "\n" + s;

    }

    @Override
    public boolean useData(double usedData) {
        double used = usedData / 1024;
        if (used > this.getDataAvailable()) {
            this.dataAvailable -= used;
            return true;
        }
        return false;
    }

}
