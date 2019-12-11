/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheets;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Dog implements Comparable<Dog>{
 private String breed;
	private String name;
	private int age;
	
	public Dog()
	{
		this("unknown", "unknown", 0);
	}
	public Dog(String breed, String name, int age)
	{
		this.breed = breed;
		this.name = name;
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int compareTo(Dog otherDog)
	{
		if(breed.equals(otherDog.breed))
		{
			return name.compareTo(otherDog.name);
		}
		else 
		{
			return breed.compareTo(otherDog.breed);
		}	
	}
	
	public String toString()
	{
		return breed + " " + name + " " + age;
	}   
}
