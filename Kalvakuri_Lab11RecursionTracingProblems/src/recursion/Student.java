/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Student {
    
    private String fname;

    /**
     *first name of the student
     * @param fname student first name
     */
    public Student(String fname) {
        this.fname = fname;
    }

    /**
     *getter method to get first name
     * @return returns first name
     */
    public String getFname() {
        return fname;
    }

    /**
     *first name of the student
     * @param fname sets first name.
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Student{" + "fname=" + fname + '}';
    }   
}