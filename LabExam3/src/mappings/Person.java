/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

/**
 *
 * @author Instructor
 */
public class Person {

    private String name;//represents full name

    public Person(String name) {
        this.name=name;
    }

    public String getName() {
       
        return name;
    }

    @Override
    public String toString() {
       return name;
    }
}
