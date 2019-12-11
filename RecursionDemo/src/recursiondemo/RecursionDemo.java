/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiondemo;


import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class RecursionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sum obj = new Sum(3,8342);
        //System.out.println(obj.evenSum(5));
        //System.out.println(obj.oddSum(1));
        //System.out.println(obj.sum(3));
        //System.out.println(obj.mystery(1357));
        
          System.out.println(mystery("Bearcats"));
        System.out.println(mystery("Northwest Bearcats Defeat Fort Hays"));
    }


    public static String mystery(String str) {
        if(str.length() == 0)
            return "";
        if (!str.contains(" ")) {
            return str.charAt(0)+" DONE";
        } else {
            return str.charAt(0) 
+ mystery(str.substring(str.indexOf(" ")+1));
        }
}
}