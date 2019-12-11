/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Customer {
  private String firstName;
  private String lastName;
  private String dob; //Format: MM/DD/YYYY

    /**
     *A three arguments constructor initializing the variables
     * @param firstName stores the first name of the customer
     * @param lastName  stores the last name of the customer
     * @param dob stores the date of birth of the customer in MM/DD/YYYY format
     */
    public Customer(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    /**
     *The getter method that returns the first name of the customer
     * @return first name of the customer as a String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *The getter method that returns the last name of the customer
     * @return returns last name of the customer as a String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *The getter method that returns the date of birth of a customer
     * @return returns date of birth as a String in MM/DD/YYYY format
     */
    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Name:  " + lastName + ", " + firstName + "\nDate of Birth: " + dob;
    }
    
    
    
}
