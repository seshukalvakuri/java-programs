/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheets;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class DogList {
    private LinkedList<Dog> dList;
	
	public DogList()
	{
		dList = new LinkedList<Dog>();
	}
	
	public void addDog(Dog dogIn) 
	{
		dList.add(dogIn);
	}
	
	public int getOldest()
	{
		int oldest = 0;
		for(Dog d : dList)
		{
			if (d.getAge() > oldest)
			{
				oldest = d.getAge();
			}
		}
		return oldest;
	}
	
	public double getAverageAge()
	{
		double sum = 0.0;
		for(Dog d : dList)
		{
			sum = sum + d.getAge();
		}
		return sum / dList.size();
	}
	
	public TreeMap<String, LinkedList<String>> getBreeds()
	{
		TreeMap<String, LinkedList<String>> breedList = 
			new TreeMap<String, LinkedList<String>>();
		for(Dog d : dList)
		{
			LinkedList<String> tempList = breedList.get(d.getBreed()); 
			if (tempList == null)
			{
				tempList = new LinkedList<String>();
            breedList.put(d.getBreed(), tempList);
			}
			tempList.add(d.getName());
//			breedList.put(d.getBreed(), tempList);
//         Note 1: The above commented statement can be included;
//         the program runs the same with or without the statement.
//         This is because tempList is a reference to the value
//         associated with the given key, so any changes to 
//         tempList are reflected in the map immediately.
//         However, you must be careful -- if the value is a 
//         primitive type (an int value representing a frequency
//         count, for example), then the put is required.
//         Note 2: If you omit the commented statement, be sure
//         to include the put statement inside the if.  Otherwise,
//         nothing will be added to the treemap.
//         Note 3: If you include the commented statement, you can
//         then remove the put statement inside the if.
		}
		return breedList;
	}
	
	public String toString()
	{
		String tempStr = "";
		Collections.sort(dList);
		for(Dog d : dList)
		{
			tempStr += d.toString() + "\n";
		}
		return tempStr;
	}
}
