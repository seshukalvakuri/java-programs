/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.ArrayList;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class RecursionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursion robj = new Recursion();
        System.out.println("gcd"+robj.gcd(12, 18));
        System.out.println("odd"+robj.sumOfOdd(-1));
        System.out.println("even"+robj.sumOfEven(4));
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam"));
        students.add(new Student("Bob"));
        students.add(new Student("Charlie"));
        students.add(new Student("David"));
        students.add(new Student("Effie"));
        
        ArrayList<ArrayList<Student>> fullList = new ArrayList<>();
        
        fullList = robj.organizeSeats(students);
        for(ArrayList<Student> st : fullList){
            for(Student stud : st){
                System.out.print(stud.getFname());
                System.out.print(",");
            }
            System.out.println();
        }
        
        ArrayList<ArrayList<Student>> selectedList = new ArrayList<>();
        
        for(ArrayList<Student> st : fullList){
            for(int index = 0; index < (st.size() - 1); index++){
                if(st.get(index).getFname().equals("Charlie") && st.get(index + 1).getFname().equals("David")){
                    selectedList.add(st);
                }
            }
        }
        
        System.out.println("\n---------------------------------------------------\n");
        for(ArrayList<Student> st : selectedList){
            for(Student stud : st){
                System.out.print(stud.getFname());
                System.out.print(",");
            }
            System.out.println();
        }
    }
    
}
