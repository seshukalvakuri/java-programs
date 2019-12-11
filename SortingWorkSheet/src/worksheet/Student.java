/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
 public class Student implements Comparable<Student>{
     
    private String idNum;
    private String lastName;
    private String firstName;
    private double gpa;

    public Student(String idNum, String lastName, String firstName, double gpa) {
        this.idNum = idNum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gpa = gpa;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "idNum=" + idNum + ", lastName=" + lastName + ", firstName=" + firstName + ", gpa=" + gpa + '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.gpa, o.gpa);
        //return Integrer.compare();
       //return this.idNum.compareTo(o.idNum);
    }
    
    
}