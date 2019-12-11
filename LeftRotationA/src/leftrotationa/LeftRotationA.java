/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftrotationa;

import java.util.Arrays;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class LeftRotationA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1, 2, 3, 4, 5};
        int d = 2;
        int n = a.length;
        int[] res = new int[n];
        int k = 0;

        //int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i + d < n) {
                res[k] = a[i + d];
                k++;
            }
             else{  
                res[k] = a[i];
            k++;
        }
        }
        //for (int j = 0; j < d; j++) {
       
        System.out.println(Arrays.toString(res));
    }
    
}

//            for(int j = 0;j<res.length;j++){
//            res[j] = a[i];
//            System.out.println(Arrays.toString(res));

