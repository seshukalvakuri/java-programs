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
public class Cube extends Square{

    /**
     *a constructor with one argument
     * @param length length is length of the side of a cube.
     */
    public Cube(double length) {
        super("Cube", length);
    }
    
    /**
     *method to calculate the area of a polygon
     * @return returns the area of the cube 
     */
    @Override
    public double getArea(){
    return super.getArea()*(enums.Solids.CUBE.getNoFaces());
    }
    
    /**
     *method to calculate circumsphere radius
     * @return returns the radius of sphere inscribed in the cube 
     */
    public double getCircumSphereRadius(){
    return ((Math.sqrt(3.0))/2.0)*(super.getLength());
    }
    
    /**
     *method to calculate insphere radius
     * @return returns the radius of sphere inscribed in the cube 
     */
    public double getInSphereRadius(){
    return (super.getLength())/2.0;
    }
    
    /**
     *method to calculate the volume
     * @return returns the volume of the cube 
     */
    public double getVolume(){
    return (super.getLength())*(super.getLength())*(super.getLength());
    }

    @Override
    public String toString() {
        String inSpRad = String.format("%.2f", this.getInSphereRadius());
         String inCI = String.format("%.2f", this.getCircumSphereRadius());
         String VOL = String.format("%.2f", this.getVolume());
        return super.toString() + "\n\tInsphere radius: " + this.getInSphereRadius() + "cms" + "\n\tCircumsphere radius: " + inCI + "cms" + "\n\tVolume: " + VOL+ "cm\u00b3";
    }
    
    
}
