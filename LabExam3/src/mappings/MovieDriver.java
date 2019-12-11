/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Instructor
 */
public class MovieDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner myScanner = new Scanner(new File("input.txt"));
        MovieMapping directed=new MovieMapping();
        Person actor = null;
        while(myScanner.hasNext()){
            String find = myScanner.nextLine();
        if(find.equals("Actor")){
            String name = myScanner.nextLine();
      actor = new Person(name);
        }
        else{
        String arr[] = find.split("-");
        String revenue = arr[0];
        Person director = new Person(arr[1]);
        String movierelease =arr[2];
        Movie movie = new Movie(revenue, director, movierelease);
        directed.addMovie(actor, movie);
        
        }
        }
            System.out.println(directed.findRevenuesMadeByDirector("Pete Docter"));
            System.out.println(directed.findActorsActed("130k", "2016")); 
            System.out.println(directed.size());

//Scanner newScan = new Scanner(new File("input.txt"));
//  MovieMapping  directed = new MovieMapping();
//  Person actor= null;
//  while(newScan.hasNext()){
//      String read = newScan.nextLine();
//  if(read.equals("Actor")){
//  String name= newScan.nextLine();
//  actor = new Person(name);
//  }
//  else{
//  read = newScan.nextLine();
//  String[] array = read.split("-");
//  String revenue= array[0];
//  Person director = new Person(array[1]);
//  String moviereleasyear = array[2];
//  Movie movie =new Movie(revenue,director,moviereleasyear);
//  }
//  }
        
        
        //Create a Scanner object to read Actor and movie details from "input.txt" file.
        
        //Create an object of MovieMapping and name it as "directed".
        
        //Declare an object for Person, name it as "actor" and initialize it to null
        
        //while input.txt has more data(While loop starts here) {
            
            //Read the first line,If the passed type is "Actor" then, read in the "name".
            
            //Create an object for Person with above read value and assign it to "actor" variable.
            
            //Else, read the next line, It will be in the following order: revenue, director name and moviereleaseyear separated by '-' separator.
            
            // With above read values, create an object Movie and name it a "movie".
            
            //Invoke addMovie() on "directed" object and add the "actor","movie".
        
        // } (while loop ends here)

        // Invoke findRevenuesMadeByDirector() on "directed" object and find
        // Revenues made by "Pete Docter".
               
        // Invoke findActorsActed() on "directed" object and find
        // actor acted for "130k" in "2016"
        
        // Print size of the hash map.
        
        
    }
    
}
