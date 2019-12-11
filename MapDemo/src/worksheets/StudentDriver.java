/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheets;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
    short idIn;
    String lNameIn;
    String fNameIn;
    short advIdIn;
    float gpaIn;
    Iterator iter;
    
    Students myStudents = new Students();
    Scanner myReader = new Scanner(new File("student.txt"));
    Scanner myKeyboard = new Scanner(System.in);
    
    while(myReader.hasNext())
    {
      idIn = myReader.nextShort();
      lNameIn = myReader.next();
      fNameIn = myReader.next();
      advIdIn = Short.parseShort(myReader.next());
      gpaIn = myReader.nextFloat();

      myStudents.addStu(
         new Student(idIn, lNameIn, fNameIn, advIdIn, gpaIn));
    } // end while

    iter = myStudents.listStudents();

    while(iter.hasNext())  
    {
      System.out.println(iter.next());
    } // end while
    System.out.println();

    System.out.println("Searching for students");
    System.out.println("Input id of student to find; " +
      "0 to stop");
    idIn = myKeyboard.nextShort();
    while(idIn != 0) 
    {
      Student myStu = myStudents.getStu(idIn);
      System.out.println(myStu);
      System.out.println("Input id of student to find; " +
	      "0 to stop");
      idIn = myKeyboard.nextShort();	
    } // end while
    System.out.println();

    System.out.println("Dropping students");
    System.out.println("Input id of student to drop; " +
	    "0 to stop");
    idIn = myKeyboard.nextShort();
    while(idIn != 0) {
	    Student myStu = myStudents.getStu(idIn);
	    System.out.println(myStu);
	    myStudents.removeStu(myStu);
	    System.out.println("Dropped");
	    System.out.println("Input id of student to drop; " +
		    "0 to stop");
	   idIn = myKeyboard.nextShort();	
    } // end while
    System.out.println();

    iter = myStudents.listStudents();

    while(iter.hasNext())  {
	    System.out.println(iter.next());
    } // end while
    System.out.println();
  } // end main
}