/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          CircularQueue<Integer> circularQueue = new CircularQueue(20);
        circularQueue.insert(34);
        circularQueue.insert(2);
        circularQueue.insert(76);
        circularQueue.insert(33);
        circularQueue.insert(45);
        circularQueue.insert(4);
        circularQueue.insert(56);
        circularQueue.insert(8);
        circularQueue.insert(34);
        circularQueue.insert(76);
        circularQueue.insert(14);
        circularQueue.insert(6);
        circularQueue.insert(72);
        circularQueue.insert(28);
        circularQueue.insert(52);
        circularQueue.insert(2);
        System.out.println("*******************************************\n"
                + "Circular Queue\n"
                + "*******************************************");
        System.out.println("Length of the circular queue is:");
        System.out.println("The length of the queue is " + circularQueue.getLength());
        System.out.println("Queue Elements:\n" + circularQueue.print());
        circularQueue.remove();
        System.out.println("Removing element from circular queue");
        System.out.println("Length of queue after removal");
        System.out.println("The length of the queue is " + circularQueue.getLength());
        System.out.println("Element removed");
        
//        System.out.println(circularQueue.retrieve());
    }

}