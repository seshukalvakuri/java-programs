/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class LinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("seshu");
        list.add("lakshmi");
        list.add("kalvakuri");
        list.add("acs");
        list.add("34");
        ListIterator<String> iterator = list.listIterator();
        System.out.println(list);
        
    }
    
}
