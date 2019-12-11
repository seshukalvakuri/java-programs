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
public class CalcDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calc = new Calculator(12, -1);
        System.out.println("ADD: " + calc.add());
        try {
            System.out.println("DIV: " + calc.div());
        } catch (ArithmeticException e) {
            System.out.println(e + " " + e.getMessage());
        }
        catch(NegativeNumberException e){
            System.out.println(e + " " + e.getMessage());
        }
        catch(KalvakuriException e){
            System.out.println(e + " " + e.getMessage());
        }
        catch(DivisibleByZeroException e){
            System.out.println(e + " " + e.getMessage());
        }
        catch(Exception e){
            System.out.println(e + " " + e.getMessage());
        }
        finally{
            System.out.println("dont forget i am working!");
        }
        System.out.println("SUB: " + calc.sub());
        System.out.println("MUL: " + calc.mul());

    }

}
