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
public class Polygon {
    private String name;
    private int noSides;

    /**
     *A constructor with two arguments
     * @param name name of the polygon
     * @param noSides number of sides in a polygon
     */
    public Polygon(String name, int noSides) {
        this.name = name;
        this.noSides = noSides;
    }
    
    /**
     *A method to calculate area
     * @return returns a value 0.0 in this class
     */
    public double getArea(){
    return 0.0;
    }
    
    /**
     *A method to calculate internal angle
     * @return returns a value 0.0 in this class
     */
    public double getInternalAngle(){
    return 0.0;
    }
    
    /**
     *A getter method to get number of sides
     * @return returns the number of sides of the polygon
     */
    public int getNoSides() {
        return noSides;
    }
    
    /**
     *a getter method to get the name
     * @return returns the name of the polygon
     */
    public String getName() {
        return name;
    }
    
    /**
     *a method to calculate the perimeter
     * @return returns 0.0 in this class
     */
    public double getPerimeter(){
    return 0.0;
    }

    @Override
    public String toString() {
        return "Polygon: " + this.getName()+ "\n\tNumber of sides: " + this.getNoSides();
    }
    
    
}
