/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.EnumSet;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Day {
  
    private static String orderDate;  

    /**
     *stores the date
     * @param orderDate
     */
    public Day(String orderDate) {
        
        Day.orderDate = orderDate;
        
    }

    /**
     *this method gets the order date
     * @return this method gets the order date
     */
    public static String getOrderDate() {
        return orderDate;
    }
    
    /**
     *this method returns the day of week
     * @return this method returns the day of week
     * @throws ParseException to handle the exceptions
     */
    public static DayOfWeek getDay() throws ParseException{
        
        DateTimeFormatter formate=DateTimeFormatter.ofPattern( "MM/dd/yyyy" );
        
        LocalDate day = LocalDate.parse(orderDate,formate);
        DayOfWeek week=day.getDayOfWeek();
    
        return week ;
    }
    
    /**
     *this method returns true if it is a weekend if not false is returned
     * @return this method returns true if it is a weekend if not false is returned
     * @throws ParseException to handle the exceptions
     */
    public static boolean isWeekend() throws ParseException{
        return EnumSet.of(DayOfWeek.FRIDAY,DayOfWeek.SATURDAY,DayOfWeek.SUNDAY).contains(getDay());
      
      
     
        
    }
  
}
