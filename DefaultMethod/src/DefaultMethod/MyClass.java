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
public class MyClass implements Interface01,Interface02{

    @Override
    public int foo(int myInt) {
        return myInt*2;
    }
    
    @Override
    public int goo(String myString){
    //return Interface02.super.goo("morning");
    return myString.lastIndexOf("o");
    }
    
}
