/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheets;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MapDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TreeMap<String,String> stateCodes = new TreeMap<String,String>();
         stateCodes.put("Missouri","MO");
         stateCodes.put("Texas","TX");
         stateCodes.put("California","CA");
         stateCodes.put("New York","NY");
         System.out.println("The code for Texas is "+stateCodes.get("Texas"));
         System.out.println("States: "+stateCodes.keySet());
         System.out.println("Codes: "+stateCodes.values());
         System.out.println("Mappings: "+stateCodes.entrySet());
         stateCodes.remove("New York");
         System.out.println("Mappings: "+stateCodes.entrySet());
         
    }
    
    
}
