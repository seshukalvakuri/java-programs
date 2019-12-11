/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.ArrayDeque;
/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 * @param <E> 
 */
public class AStack<E>{

    private ArrayDeque<E> myStack;

    /**
     *constructor initialising the mystack
     */
    public AStack() {
        myStack = new ArrayDeque<>();
    }

    /**
     *method to push the element
     * @param element element of type generic
     */
    public void push(E element) {
        myStack.push(element);
    }

    /**
     *this method returns the element popped
     * @return returns popped element
     */
    public E pop() {
        return myStack.pollFirst();
    }

    /**
     *this method peeks the element
     * @return returns the element peek
     */
    public E peek() {
        return myStack.peekFirst();
    }

    /**
     *this method of type integer finds the size of the stack
     * @return returns the size of the stack
     */
    public int size() {
        return myStack.size();
    }

    /**
     *this method returns boolean value if the stack is empty
     * @return this method returns boolean value if the stack is empty
     */
    public boolean isEmpty() {
        return myStack.isEmpty();
    }
    
}