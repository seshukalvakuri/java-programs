/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import rates.*;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Call {
    Tarrif callType;
       String endTime;
      String phoneNumber;
      String startTime;

    /**
     *<p>This is a constructor</p>
     * @param callType of Tarrif data type
     * @param endTime of String data type
     * @param phoneNumber of String data type
     * @param startTime of String Start type
     */
    public Call(Tarrif callType , String endTime, String phoneNumber, String startTime) {
        this.callType = callType;
        this.endTime = endTime;
        this.phoneNumber = phoneNumber;
        this.startTime = startTime;
    }

    /**
     *This is a getter method of call Type.
     * @return returns callType.
     */
    public Tarrif getCallType() {
       return callType;
    }

    /**
     *<p>This is a getter method of End time</p>
     * @return returns end time.
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     *<p>This is a getter phone number of type String</p>
     * @return returns phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *<p> This is a getter Start Time of type String</p>
     * @return returns start time 
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     *This is a getter method seconds which throw parseException
     * @return returns seconds.
     * @throws ParseException
     */
    public  double getSeconds() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start= s.parse(startTime);
        Date end = s.parse(endTime);
        double sec = (end.getTime()-start.getTime())/1000;
        return sec;
    }
    @Override
    public String toString() {
        return phoneNumber + "\t"+startTime+"\t"+endTime+"\t"+callType;
    }
}
