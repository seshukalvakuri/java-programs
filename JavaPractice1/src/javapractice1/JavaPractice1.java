/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice1;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class JavaPractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[][] = {
                        {1,2,3},
                        {1,2,3},
                        {1,2,3},
                      };
        for(int i=0;i<arr.length;i++){
            int sum = 0;
        for(int j =0;j<arr.length;j++){
        sum += arr[i][j];
        }
        //System.out.println("row sum="+sum);
        int[] resArray = new int[3];
        for(int k =0;k<resArray.length;k++){
        resArray[i]=sum;
        }
        System.out.println(resArray[i]);
        }
        for(int i=0;i<arr.length;i++){
            int sum = 0;
        for(int j =0;j<arr.length;j++){
        sum += arr[j][i];
        }
        System.out.println("column sum="+sum);
        }
        
    }
    
}
