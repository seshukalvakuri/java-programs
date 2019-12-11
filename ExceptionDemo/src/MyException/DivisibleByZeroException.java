/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyException;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class DivisibleByZeroException extends RuntimeException{

    public DivisibleByZeroException() {
    }

    public DivisibleByZeroException(String message) {
        super(message);
    }

   
}
