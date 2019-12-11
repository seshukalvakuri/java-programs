/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MoviesTester {
/**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Kalvakuri_ALinkedList<Movie> marvels =
                new Kalvakuri_ALinkedList<>();
        
        Scanner myScanner = new Scanner(new File("movies.txt"));

        while (myScanner.hasNext()) {
            marvels.addFirst(new Movie(myScanner.nextLine(), myScanner.nextLine(), myScanner.nextInt()));
            if (myScanner.hasNext()) {
                myScanner.nextLine();
            }
        }
        System.out.println(marvels);
        System.out.println(marvels.size() + " movies in the list");
        System.out.println("deleting " + marvels.removeFirst());
        System.out.println(marvels.size() + " courses in the list");
    }
    
}
