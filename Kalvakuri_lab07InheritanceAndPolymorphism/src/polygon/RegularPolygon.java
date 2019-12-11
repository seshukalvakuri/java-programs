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
public class RegularPolygon extends Polygon {

    private double length;

    /**
     *A constructor with three arguments which initializes all the instance variables of super class and also the instance variables of the RegularPolygon class 
     * @param length length of each side.
     * @param name name of the polygon
     * @param noSides number of sides 
     */
    public RegularPolygon(String name, int noSides, double length) {
        super(name, noSides);
        this.length = length;
    }
    
    @Override
    public double getArea() {
        //System.out.println(length);
        return (0.25) * ((this.length) * (super.getNoSides() * super.getNoSides())) * (1.0 / (Math.tan(Math.PI / this.length)));
    }

    /**
     *A method to calculate circumcircle radius
     * @return returns the inscribed circle radius of the regular polygon using number of sides and number of sides in double
     */
    public double getCircumCircleRadius() {
        return (this.length / 2.0) * ((1.0) / (Math.sin(Math.PI / super.getNoSides())));
    }

    /**
     *A method to calculte the incircle radius
     * @return returns the inscribed circle radius of the regular polygon using number of sides and number of sides in double 
     */
    public double getInCircleRadius() {
        return (this.length / 2) * ((1.0) / (Math.tan(Math.PI / super.getNoSides())));
    }

    @Override
    public double getInternalAngle() {
        return (180 / super.getNoSides()) * (super.getNoSides() - 2);
    }

    /**
     *A getter method to get length of the side
     * @return returns the length of the side of polygon
     */
    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return super.getNoSides() * this.length;
    }

    @Override
    public String toString() {
        String a1 = String.format("%.2f", this.getLength());
        String a2 = String.format("%.2f", this.getInternalAngle());
        String a3 = String.format("%.2f", this.getCircumCircleRadius());
        String a4 = String.format("%.2f", this.getInCircleRadius());
        String a5 = String.format("%.2f", this.getArea());
        String a6 = String.format("%.2f", this.getPerimeter());
        return super.toString() + "\n\tLength of side: " + a1 + "cms" + "\n\tInternal angle: " + a2 + "\u00b0" + "\n\tCircumcircle radius: " + a3 + "cms" + "\n\tIncircle radius: " + a4 + "cms" + "\n\tArea: " + a5 + "cm\u00b2" + "\n\tPerimeter: " + a6 + "cms";
    }

}
