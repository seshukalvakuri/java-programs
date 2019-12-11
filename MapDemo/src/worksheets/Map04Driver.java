/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheets;

import java.util.LinkedList;
import java.util.TreeMap;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Map04Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog1 = new Dog("Standard Poodle", "Midge", 6);
		Dog dog2 = new Dog("Standard Poodle", "Zelda", 10);
		Dog dog3 = new Dog("Maltese", "Pete", 1);
		Dog dog4 = new Dog();
		System.out.println("Dog1 information: " + dog1);
		System.out.println();
		System.out.println("Dog1 breed: " + dog1.getBreed());
		System.out.println("Dog2 name: " + dog2.getName());
		System.out.println("Dog3 age: " + dog3.getAge());
		System.out.println();
		dog4.setBreed("Chinese Crested");
		dog4.setName("Trigger");
		dog4.setAge(2);
		System.out.print("Dog4 information: " + dog4.getBreed() + " ");
		System.out.print(dog4.getName() + " ");
		System.out.println(dog4.getAge());
		System.out.println();
		System.out.println("Comparing dog1 to dog2: " + dog1.compareTo(dog2));
		System.out.println("Comparing dog1 to dog3: " + dog1.compareTo(dog3));
		System.out.println("Comparing dog2 to dog4: " + dog2.compareTo(dog4));
		System.out.println();
		DogList myDogs = new DogList();
		myDogs.addDog(dog1);
		myDogs.addDog(dog2);
		myDogs.addDog(dog3);
		myDogs.addDog(dog4);
		System.out.println("The age of the oldest dog is: " + 
			myDogs.getOldest());
		System.out.println("The average age of the dogs is: " + 
			myDogs.getAverageAge());
		System.out.println();
		myDogs.addDog(new Dog("Chinese Crested", "Sally", 15));
		myDogs.addDog(new Dog("Chinese Crested", "Susie Q", 3));
		TreeMap<String, LinkedList<String>> myDogBreeds = myDogs.getBreeds();
		System.out.println("Contents of the TreeMap");
		System.out.println(myDogBreeds.entrySet());
		System.out.println();
		System.out.println(
			"Dog information, sorted by breed, and then by name");
		System.out.println(myDogs);
	}

}