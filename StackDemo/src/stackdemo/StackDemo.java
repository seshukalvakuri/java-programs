/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

import java.util.Stack;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class StackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> newStack = new Stack<String>();
        Stack<String> revStack = new Stack<String>();
        newStack.push("seshu");
        newStack.push("Lakshmi");
        newStack.push("acs");
        newStack.push("northwest");
        newStack.push("45");
        newStack.push("36");
        System.out.println(newStack);
        newStack.pop();
        System.out.println(newStack);

        System.out.println("empty");
        System.out.println(newStack.empty());
        System.out.println(newStack);
        System.out.println(newStack.search("45"));
        while (!newStack.empty()) {
            revStack.push(newStack.pop());
        }

        System.out.println(revStack);
        System.out.println(revStack.peek());

    }

}
