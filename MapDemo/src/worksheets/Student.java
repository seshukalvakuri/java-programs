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
public class Student implements Comparable<Student>{
    private short studentId;
    private String lastName;
    private String firstName;
    private short advisorId;
    private float gpa;
    
    /**
     * Constructor for objects of class Student
     * with no parameters.  
     * Creates a Student object with id and 
     * advisor id = 0, gpa = 0, and empty strings
     * for first and last name.
     */
    public Student() 
    {
        studentId = 0;
        lastName = "";
        firstName = "";
        advisorId = 0;
        gpa = 0.0f;
    }
    
    /**
     * Constructor for objects of class Student
     * @param stuId -- student id
     * @param lName -- last name of student
     * @param fName -- first name of student
     * @param advisor -- faculty id of advisor
     * @param gpa -- gpa of the student
     */
    public Student(short stuId, String lName, String fName,
                   short advId, float gpa) 
    {
        studentId = stuId;
        lastName = lName;
        firstName = fName;
        advisorId = advId;
        this.gpa = gpa;
    }
    
    /**
     * returns id of this Student
     * @return id of this Student 
     */
    public short getStudentId() 
    {
        return studentId;
    }

    /**
     * returns last name of this Student
     * @return last name of this Student 
     */
   public String getLastName() 
   {
   
      return lastName;
   }

    /**
     * returns first name of this Student
     * @return first name of this Student 
     */
    public String getFirstName() 
    {
      return firstName;
    }

    /**
     * returns id of this Student's faculty advisor
     * @return faculty id of this Student's advisor 
     */
    public short getAdvisorId() 
    {
      return advisorId;
    }
    
    /**
     * returns this Student's gpa
     * @return gpa of this Student 
     */
    public float getGpa() 
    {
      return gpa;
    }

    /**
     * returns String representation of this Student
     * @return String consisting of this Student's id
     * followed by last name, first name, advisor's id,
     * and gpa, separated by a single space
     */
    public String toString() 
    {
      return studentId + " " + firstName + " " + lastName + " " 
      + advisorId + " " + gpa;
    }
    public int compareTo(Student otherStudent)
    {
      if(this.studentId < otherStudent.studentId)
      {
	return +1;
      } else if(this.studentId > otherStudent.studentId)
      {
	return -1;
      } else
      {
	return 0;
      }
    }
}