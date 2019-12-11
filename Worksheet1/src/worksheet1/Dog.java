/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Dog {
    private String name;
	private int age;

	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Dog()
	{
		this("", 0);
	}
	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name + " " + age;
	}

    
}
