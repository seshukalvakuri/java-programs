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
public class Recursion {

    /**
     * method to calculate greatest common diviser
     * @param x integer value x
     * @param y integer value y
     * @return
     */
    public int gcd(int x, int y) {
        if (y != 0) {
            return gcd(y, x % y);
        } else {
            return x;
        }
    }

    /**
     *method to calculate sum of odd numbers
     * @param n integer value 
     * @return returns integer value
     */
    public int sumOfOdd(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else if(n<=0){
            return 0;
        }  
        else if (n % 2 == 1) {
            return n + sumOfOdd(n - 1);
        } else if (n % 2 == 0) {
            n = n - 1;
            return n + sumOfOdd(n - 1);
        } else {
            return n;
        }
    }

    /**
     *method to calculate sum of even numbers
     * @param n integer value
     * @return returns integer value.
     */
    public int sumOfEven(int n) {
           if(n<=1)
        {
            return 0;
        }
        else if(n<=3 || n==2)
        {
            return 2;
        }
        else if(n%2 == 0)
        {
           return n+sumOfEven(n-2);
        }
        else 
        {
            n=n-1;
            return (n)+sumOfEven(n-2);
        }

    }

    /**
     *method to organizeSeats
     * @param studentList arraylist name 
     * @return return the arrangements possible.
     */
    public ArrayList<ArrayList<Student>> organizeSeats(ArrayList<Student> studentList) {
        if (studentList.isEmpty()) {
            ArrayList<ArrayList<Student>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        ArrayList<ArrayList<Student>> returnMe = new ArrayList<>();

        Student firstStudent = studentList.remove(0);

        ArrayList<ArrayList<Student>> recursiveList = organizeSeats(studentList);

        for (ArrayList<Student> st : recursiveList) {

            for (int index = 0; index <= st.size(); index++) {
                ArrayList<Student> temp = new ArrayList<>(st);
                temp.add(index, firstStudent);
                returnMe.add(temp);
            }
        }
        return returnMe;
    }

}
