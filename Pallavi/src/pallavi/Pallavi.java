/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallavi;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
import java.util.ArrayList;
public class Pallavi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> gradePoints = new ArrayList<Double>();
        gradePoints.add(2.88);
        gradePoints.add(3.6);
        gradePoints.add(3.2);
        gradePoints.add(2.6);
        if(gradePoints.contains(3.0))
           gradePoints.remove(3.0);
        else
           gradePoints.remove(3.2);
        
        gradePoints.add(2,3.4);
        for(double d:gradePoints){ 
           System.out.print(d + ", ");
        }
        System.out.println();
    }
    
}
