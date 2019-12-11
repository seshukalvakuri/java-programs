/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Worksheet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner myScanner = new Scanner(new File("arrayData.txt"));
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		int numIn;
		
		while((numIn = myScanner.nextInt()) != -1)
		{
			myNums.add(numIn);
			System.out.print(numIn + " ");
		}
		System.out.println();
		
		ArrayList<Dog> myDogs = new ArrayList<Dog>();
		while(myScanner.hasNext())
		{
			myDogs.add(new Dog(myScanner.next(), myScanner.nextInt()));
                       
			System.out.println("size of myDogs = " + myDogs.size());
		}

		for(Dog myDog : myDogs)
		{
			System.out.println(myDog);
		}
		
		System.out.println(myDogs.get(2));
	}
}
