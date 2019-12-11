/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Actor extends Person {
    
   private int age;
    private double renumeration;

    public Actor(String firstName, String lastName, int age, double renumeration) {
        super(firstName, lastName);
        this.age = age;
        this.renumeration = renumeration;
    }

    public int getAge() {
        return age;
    }

    public double getRenumeration() {
        return renumeration;
    }

    @Override
    public int compareTo(Person per) {
        Actor actor1 = (Actor) per;
        return Double.compare(actor1.renumeration, this.renumeration);
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tAge: " + age;
    }

}
