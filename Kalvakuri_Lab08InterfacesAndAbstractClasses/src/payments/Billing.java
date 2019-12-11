/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public interface Billing {

    /**
     *this a abstract method calculates bill
     * @return returns the bill on services
     */
    double calcBill();

    /**
     *this is a abstract method to discount for customer.
     * @return returns the discount amount;
     */
    double discountForReturningCustomer();
}
