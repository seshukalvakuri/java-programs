/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class studentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("studentData.txt"));
        ArrayList<Student> studentList = new ArrayList<>();
        while (scan.hasNext()) {
            //String id = scan.next();
            //S
            Student s = new Student(scan.next(), scan.next(), scan.next(), scan.nextDouble());
            studentList.add(s);
        }
        System.out.println("Default order");
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("***********************************");
        Collections.sort(studentList);

        System.out.println("Default sorted order");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getLastName().compareTo(s2.getLastName()) == 0) {
                    return s1.getFirstName().compareTo(s2.getFirstName());
                } else {
                    return s1.getLastName().compareTo(s2.getLastName());
                }
            }
        });
        System.out.println("Custom sorted order");

        for(Student s4:studentList){
            System.out.println(s4);
        }
        Integer i1=10;
        Integer i2=20;
        System.out.println(i1.compareTo(i2));
        System.out.println(i2.compareTo(i1));
         System.out.println(i1.compareTo(i1));
         
         String str1="abc";
         String str2="def";
         System.out.println(str1.compareTo(str2));
    }

}
