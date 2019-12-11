/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapdemo;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,String> stateMap;
        stateMap = new HashMap<String,String>();
        stateMap.put("Missouri", "MO");
        stateMap.put("Texas", "TX");
        stateMap.put("Missisipi", "MS");
        stateMap.put("Montana", "MT");
        stateMap.put("Missouri", "MISS");
        //returning actual set
        System.out.println(stateMap);
        //returning the values values type set
        System.out.println(stateMap.values());
        //returning the keys keyset is of type set
        System.out.println(stateMap.keySet());
        //returning the entire set in square brcakets as it is a set.
        System.out.println(stateMap.entrySet());
        //retruning the value of the key Texas 
        System.out.println(stateMap.get("Texas"));
        System.out.println(stateMap.remove("Missisipi"));
        System.out.println(stateMap.containsKey("Missisipi"));
        System.out.println(stateMap.containsValue("TX"));
        
        TreeMap<String,ArrayList<String>> facultyMap = new TreeMap<String,ArrayList<String>>();
        ArrayList<String> bandiCourse = new ArrayList<String>();
        bandiCourse.add("GDP2");
        bandiCourse.add("JAVA");
        bandiCourse.add("JAVA");
        bandiCourse.add("DV");
        facultyMap.put("Bandi", bandiCourse);
        ArrayList<String> caseCourse = new ArrayList<String>();
        caseCourse.add("GDP1");
        caseCourse.add("WEBAPP");
        caseCourse.add("BIGDATA");
        caseCourse.add("WEBAPP");
        facultyMap.put("Case", caseCourse);
        ArrayList<String> hootCourse = new ArrayList<String>();
        hootCourse.add("JAVA");
        hootCourse.add("DATASTRUCTURES");
        hootCourse.add("CS");
        hootCourse.add("SETS");
        facultyMap.put("Hoot", hootCourse);
        System.out.println(facultyMap);
    }
    
}
