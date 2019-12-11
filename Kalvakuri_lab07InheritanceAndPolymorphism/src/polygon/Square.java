/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Square extends RegularPolygon {
    
    /**
     *A constructor with one argument
     * @param length length is the length of the side
     */
    public Square(double length) {
        super("Square", 4, length);
    }

    /**
     *A constructor with two arguments
     * @param name name of the polygon
     * @param length length of the side
     */
    public Square( String name, double length) {
        super(name, 4, length);
    }
    
    
    
}
