/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyException;

import java.util.InputMismatchException;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Calculator {
  private int num1;
  private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
  
  public int add(){
  return num1+num2;
  }
  
  public int sub(){
  return num1-num2;
  }
  
  public int mul(){
  return num1*num2;
  }
  
  public int div() {
      if(num2<0){
      //throw new InputMismatchException("this is a negative number");
      //throw new NegativeNumberException("Negative number");
      throw new KalvakuriException("new created exception");
      
      }
      if(num2 == 0){
          System.out.println("ecxption occurs");
          //throw new ArithmeticException("denominator can not be zero");
          throw new DivisibleByZeroExcepton("Is divisible by zero");
      }
  return num1/num2;
  }


}
