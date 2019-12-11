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
public class EquilateralTriangle extends RegularPolygon{

    /**
     *  A constructor with one argument
     * @param length length of side of equilateral triangle
     */
    public EquilateralTriangle(double length) {
        super("Equilateral Triangle", 3, length);
    }
    
    /**
     *A constructor with two arguments
     * @param name name of the polygon
     * @param length length of side of equilateral triangle
     */
    public EquilateralTriangle( String name, double length) {
        super(name, 3, length);
    }
    
    /**
     *a method to calculate the height of the triangle
     * @return returns the height of the equilateral triangle 
     */
    public double getHeight(){
    return ((Math.sqrt(3.0))/2.0)*(super.getLength());
    }

    @Override
    public String toString() {
        String height = String.format("%.2f", this.getHeight());
        return super.toString()+"\n\tHeight: " + height+"cms";
    }
    
    
}
