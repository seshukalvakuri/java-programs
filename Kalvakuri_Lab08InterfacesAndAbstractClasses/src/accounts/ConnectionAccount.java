/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class ConnectionAccount{

    private String connectionType;
    private String customerName;
    private String joiningDate;
    private String phoneNumber;

    /**
     *<p>This is a connection Account constructor.</p>
     * @param connectionType of String data type.
     * @param customerName of String data type.
     * @param joiningDate of String data type.
     * @param phoneNumber of String data type.
     */
    public ConnectionAccount(String connectionType, String customerName, String joiningDate, String phoneNumber) {
        this.connectionType = connectionType;
        this.customerName = customerName;
        this.joiningDate = joiningDate;
        this.phoneNumber = phoneNumber;
    }

    /**
     *<p>This is a connection Account  </p>
     * @param connectionType of String data type
     * @param customerName of String data type
     * @param phoneNumber of String data type.
     */
    public ConnectionAccount(String connectionType, String customerName, String phoneNumber) {
        this.connectionType = connectionType;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    /**
     *<p>This is a getter method named connection type of the customer.</p>
     * @return returns connection Type
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     <p>This getter method named the customerName.</p>
     * @return returns customer Name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     *<p>This is a getter method named joining Date.</p>
     * @return returns joiningDate
     */
    public String getJoiningDate() {
        return joiningDate;
    }

    /**
     *<p>This is a getter method named as  phone Number.</p>
     * @return returns phone Number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     *<p>This is number of years method</p>
     * @return returns calculating number of years between account opening date and current system date.
     */
    public int numberOfYears(){
         DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ldate= LocalDate.parse(joiningDate, format);
        LocalDate nDate = LocalDate.now();
        int years = (int) ChronoUnit.YEARS.between(ldate, nDate);
        return years;
      
    }
    
    
}
