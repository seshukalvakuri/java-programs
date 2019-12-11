/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiondemo;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Sum {
    int n;
    
    public Sum(int n,int numIn) {
        this.n = n;
    }
    
    
    public int evenSum(int n ){
        if(n == 0 || n==1){
        return 0;
        }
        else if(n==3 || n==2){
        return 2;
        }
        else{
        return n+evenSum(n-2);
        }
    //if(n%2 == 0){
    //return n+evenSum(n-1);
    //}
    //else{
    //return 0;
    }
    
    public int oddSum(int n){
        if(n==1 || n==2){
        return 1;
        }
        else if(n%2==1){
        return n+oddSum(n-1);
        }
        else if(n%2 == 0){
        n=n-1;
        return n+oddSum(n-1);
        }
        else{
            return n;
                }
    }
    
    public int sum(int n){
    if(n==0){
    return 0;
    }
    else{
    return n+sum(n-1);
    }
    }
    
    public  int mystery(int numIn) {
               if (numIn == 0) {
            return 0;
        } else {
            if ((numIn % 2) == 0) {
                return mystery(numIn / 10);
            } else {
                return numIn % 10 + mystery(numIn / 10);
            }
        }

    }

}
