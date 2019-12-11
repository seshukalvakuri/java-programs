/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalvakuriassign11;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class KalvakuriAssign11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521/pbdorc1";
        String username = "hr";
        String password = "hr";
        Statement dbStatement = null;
        ResultSet dbResultSet = null;
        Connection conn = null;

        try {
            conn
                    = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful.");
        } catch (SQLException ex) {
            System.out.println("Problems with connection" + ex);
        }

        String query
                = "select S_ID,TOTAL_SCORE, READING_SCORE, WRITING_SCORE, MATH_SCORE from studentmarks";
        System.out.println("Query: " + query);
        try {
            dbStatement
                    = conn.createStatement();
            System.out.println("Statement created successfully.");
        } catch (SQLException ex) {
            System.out.println("Problems creating statement" + ex);
        }
        try {
            dbResultSet = dbStatement.executeQuery(query);
            System.out.println("Query executed correctly.");
        } catch (SQLException ex) {
            System.out.println("Problems executing statement" + ex);
        }
        int count = 0;
        while (dbResultSet.next()) {
            count++;
            if (dbResultSet.getInt("TOTAL_SCORE") != dbResultSet.getInt("MATH_SCORE") + dbResultSet.getInt("READING_SCORE") + dbResultSet.getInt("WRITING_SCORE")) {
                CallableStatement updateTotalScore = conn.prepareCall("call update_total(" + dbResultSet.getInt("S_ID") + "," + dbResultSet.getInt("TOTAL_SCORE") + ") ");
                updateTotalScore.executeUpdate();

            }

        }
        try {
            dbResultSet = dbStatement.executeQuery(query);
            System.out.println("Query executed correctly.");
            System.out.println("S_ID MATH_SCORE READING_SCORE WRITING_SCORE TOTAL_SCORE");
            while (dbResultSet.next()) {
                System.out.println(
                        dbResultSet.getInt("S_ID") + "\t     " + dbResultSet.getInt("MATH_SCORE") + "\t     " + dbResultSet.getInt("READING_SCORE") + "\t     " + dbResultSet.getInt("WRITING_SCORE") + "\t     " + dbResultSet.getInt("TOTAL_SCORE")
                );

            }
        } catch (SQLException ex) {
            System.out.println("Problems executing statement" + ex);
        }

        try {
            dbStatement.close();
            System.out.println("Statement closed.");
        } catch (SQLException ex) {
            System.out.println("Problem closing statement.");
        }
        try {
            conn.close();
            System.out.println("Connection closed.");
        } catch (SQLException ex) {
            System.out.println("Problem closing connection.");
        }
    }
}
