/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DefaultMethod;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public interface Interface02  {
    default int goo(String myString){
    return myString.indexOf("o");
    }
    
    
    
    
}
