/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nweyearchaos;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class NweYearChaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {3,2,1,4};
        int[] res = new int[5];
        for(int i = 0; i < a.length-1; i++){
            if(a[i]>a[i+1]){
                a[i+1]=a[i];
            a[i]=a[i+1];
            
            }
            }
            for(int j = 0;j<a.length;j++){
                System.out.println(a[j]);
        }
        }
     
            //a[i]=i+1;
           

        
        
        
        
        
    }
    
//if(a[i]>a[i+1]){
//            for(int k = 0;k<res.length;k++){
//            res[] = a[i];
