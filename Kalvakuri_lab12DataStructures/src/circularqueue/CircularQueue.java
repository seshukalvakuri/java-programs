/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 * @param <E>
 */
public class CircularQueue<E> {

    private int currentSize;
    private E[] circularQueueElements;
    private int maxSize;
    private int rear;
    private int front;

    /**
     *
     * @param maxSize variable of type integer which stores the maximun size
     */
    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueueElements = (E[]) new Object[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }

    /**
     * Check if queue is full.
     * @return returns if the queue is full
     */
    public boolean isFull() {
        return (getLength() == circularQueueElements.length);
    }

    /**
     * Check if Queue is empty.
     * @return returns if the queue is empty
     */
    public boolean isEmpty() {
        return (getLength() == 0);
    }

    /**
     *
     * @param element it is of type generic
     * @throws IndexOutOfBoundsException
     */
    public void insert(E element) throws IndexOutOfBoundsException {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Circular Queue is full. Element cannot be added");
        } else {
            rear = (rear + 1) % circularQueueElements.length;
            circularQueueElements[rear] = element;
            currentSize++;
            if (front == -1) {
                front = rear;
            }
        }
    }
    
    /**
     *this method returns if the element to remove
     * @return eturns the removed element
     * @throws UnsupportedOperationException
     */
    public E remove() throws UnsupportedOperationException {
        E removeElement;
        if (isEmpty()) {
            throw new UnsupportedOperationException("Circular Queue is empty. Element cannot be removed");
        }
        else {
            removeElement = circularQueueElements[front];
            circularQueueElements[front] = null;
            front = (front + 1) % circularQueueElements.length;
            currentSize--;
        }
        return removeElement;
    }

    /**
     *this method is to calculate the length
     * @return returns the current size
     */
    public int getLength(){
        return currentSize;
    }
    
    /**
     *
     * @return returns the element retrived
     * @throws UnsupportedOperationException
     */
    public E retrieve() throws UnsupportedOperationException{
        if (isEmpty()) {
            throw new UnsupportedOperationException("Circular Queue is empty. Element cannot be removed");
        }else
        return circularQueueElements[front];
    }
    
    /**
     *Print the contents of the queue with the front of the queue shown first
     * @return returns the format, it is done recursively
     */
    public String print() {
        String printing = "";
        for(int i = 0; i< currentSize; i++){
            printing += circularQueueElements[i] +"\n";
        }
        String newPrinting = printing.substring(0, printing.length()-1);
        return newPrinting;
    }
}
