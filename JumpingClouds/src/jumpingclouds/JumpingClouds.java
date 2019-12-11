/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpingclouds;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class JumpingClouds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int length = s.nextInt();
        int[] c = new int[length];
        System.out.println("enter the path");
        for (int i = 0; i < c.length; i++) {
            int temp = s.nextInt();
           if(temp == 0 || temp == 1) {
                c[i] = temp;
            }
           else{
               System.out.println("wrong input");
               break;
           }
            
        }
        System.out.println(Arrays.toString(c));
        int i = 0;
        int count = 0;
        while (i < c.length - 1 || c.length-1 == 1) {
            if (c[i + 2] == 1) {
                i++;
                count++;
            }
            else{
                i += 2;
                count++;
            }
        }
           System.out.println(count);
    }

}
