/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Exhibitordriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        final int CURRENT_YEAR = 2006;
		Exhibitor exhibitor1;
		Scanner myReader = new Scanner(new File("Exhibitor.txt"));
		String lastNameIn;
		String firstNameIn;
		int yearOfBirthIn;
		int pointsIn;
		int numEventsIn;
		ArrayList<Exhibitor> myList = new ArrayList<Exhibitor>();
				
		while(myReader.hasNext())
		{
			lastNameIn = myReader.next();
			firstNameIn = myReader.next();
			yearOfBirthIn = myReader.nextInt();
			pointsIn = myReader.nextInt();
			if(CURRENT_YEAR - yearOfBirthIn > 18)
			{
				exhibitor1 = new Amateur(lastname, firstname,
						yearOfBirthIn, pointsIn);
			} else
			{
				numEventsIn = myReader.nextInt();
				exhibitor1 = new Youth(lastname, firstname,
						yearOfBirthIn, pointsIn, numEventsIn);
			}
			myList.add(exhibitor1);
		}
		
		for(Exhibitor exh : myList)
		{
			System.out.println(exh + " " + 
					((CURRENT_YEAR - exh.getYear() > 18) ? "Amateur" : "Youth") +
					" " + exh.worldShowQualified());
		}
		
		exhibitor1 = new Amateur();
		exhibitor1.setLastname("Jones");
		exhibitor1.setFirstname("Andy");
		exhibitor1.setYear(1973);
		exhibitor1.setPoints(100);
		System.out.println();
		System.out.print(exhibitor1.getFirstname() + " ");
		System.out.print(exhibitor1.getLastname() + " ");
		System.out.print(exhibitor1.getYear() + " ");
		System.out.println(exhibitor1.getPoints());
		
		exhibitor1 = new Youth();
		exhibitor1.setLastname("Davis");
		exhibitor1.setFirstname("Alice");
		exhibitor1.setYear(1993);
		exhibitor1.setPoints(100);
		((Youth)exhibitor1).setNumEvents(4);
		System.out.println();
		System.out.print(exhibitor1.getFirstname() + " ");
		System.out.print(exhibitor1.getFirstname() + " ");
		System.out.print(exhibitor1.getLastname() + " ");
		System.out.print(exhibitor1.getPoints() + " ");
		System.out.println(((Youth)exhibitor1).getNumEvents());
	}	
    }
    

