/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalvakuri_sqlinjection;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Kalvakuri_SqlInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String username = "bankInfo";
        String password = "bankInfo";
        Statement dbStatement = null;
        ResultSet dbResultSet = null;
        int rowsReturned = 0;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Bank connection successful.");
        } catch (SQLException ex) {
            System.out.println("Problems with connection\n" + ex);
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Please login with your account information");
        System.out.println("-----------------------------------------------------------------");
        
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your account number: ");
        String accountnumber1 = scr.nextLine();
        System.out.println("Enter your username: ");
        String username1 = scr.nextLine();
        System.out.println("Enter your password: ");
        String password1 = scr.nextLine();
        
        String query
                = "select accountbalance from accounts where username = '" + username1 + "' and password='" + password1 + "'";
        System.out.println("*******************************************************************");
        try {
            dbStatement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            //System.out.println("Statement created successfully.");
        } catch (SQLException ex) {
            System.out.println("Problems creating statement" + ex);
        }
        try {
            dbResultSet = dbStatement.executeQuery(query);
            //System.out.println("\nQuery executed correctly.");
            

            if(dbResultSet != null)
            {
            dbResultSet.last();
            rowsReturned = dbResultSet.getRow();
            dbResultSet.beforeFirst();
            }
            else
            {
                rowsReturned = 0;
            }
            
        } catch (SQLException ex) {
            System.out.println("Problems executing statement - " + query + "\n" +ex);
        }
        if (rowsReturned != 0)
        {
            System.out.print("Your account balance is :$");
            displayResults(dbResultSet);
            System.out.println("*******************************************************************\n");
            System.out.println("Thank you for banking with security bank.");
        }
        else
        {
            System.out.println("Incorrect login.  Please try again.");
        }
        try {
            dbStatement.close();
            //System.out.println("Statement closed.");
        } catch (SQLException ex) {
            System.out.println("Problem closing statement.");
        }
        try {
            conn.close();
            //System.out.println("\nConnection closed.");
        } catch (SQLException ex) {
            System.out.println("Problem closing connection.");
        }
    }
    public static void displayResults(ResultSet dbrs) {
        int count = 0;
        try {
            while (dbrs.next()) {
                System.out.println(dbrs.getString(1));
                count++;
            }
        } catch (SQLException ex) {
            System.out.println("SQLException occurred while displaying results.\n" + ex);
        }
//        System.out.println();
//        System.out.println(count + " records in result set");
    }
}