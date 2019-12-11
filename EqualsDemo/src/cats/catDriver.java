/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class catDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Hello";
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str == str2);
        System.out.println(str.equals(str1));
        System.out.println(str1.equals(str2));
        System.out.println(str.equals(str2));
        System.out.println("*****************printing hashcode*****************************");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("*************printing address of string***********************************");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println("**************converting to hexadecimal**********************************");
        System.out.println(Integer.toHexString(System.identityHashCode(str)));
        System.out.println(Integer.toHexString(System.identityHashCode(str1)));
        System.out.println(Integer.toHexString(System.identityHashCode(str2)));
        //System.out.println("************************************************");
        cat c1 = new cat(1, "Baby");
        cat c2 = new cat(1, "Big");
        System.out.println("********************printing hashcode ******************************");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println("***************printing address of cat objects***********************************");
        System.out.println(System.identityHashCode(c2));
        System.out.println(System.identityHashCode(c1));
        System.out.println("******************converting to hexadecimal****************************************");
        System.out.println(Integer.toHexString(System.identityHashCode(c1)));
        System.out.println(Integer.toHexString(System.identityHashCode(c2)));
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

    }

}
