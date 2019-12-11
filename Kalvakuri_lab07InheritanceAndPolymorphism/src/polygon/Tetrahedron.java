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
public class Tetrahedron extends EquilateralTriangle{

    /**
     *A constructor with one argument
     * @param length length of the side
     */
    public Tetrahedron(double length) {
        super("Tetrahedron", length);
    }

    @Override 
    public double getArea(){
    return (super.getArea())*(enums.Solids.TETRAHEDRON.getNoFaces());
    }
    
    /**
     *A method to calculate circumsphere radius
     * @return returns the radius of sphere inscribed in the tetrahedron in double 
     */
    public double getCircumSphereRadius(){
    return ((Math.sqrt(6.0))/4.0)*(super.getLength());
    }
     
    @Override
   public double getHeight(){
   return ((Math.sqrt(6.0))/3.0)*(super.getLength());
   }
    
    /**
     *A method to calculate Insphere radius 
     * @return returns the radius of sphere inscribed in the tetrahedron in double
     */
    public double getInSphereRadius(){
   return (super.getLength())/(Math.sqrt(24.0));
   }
   
    /**
     *A method to calculate volume of the tetrahedron
     * @return returns the volume of the tetrahedron in double
     */
    public double getVolume(){
   return ((Math.sqrt(2.0))/12.0)*((super.getLength())*(super.getLength())*(super.getLength()));
   }

    @Override
    public String toString() {
        String a1 = String.format("%.2f", this.getInSphereRadius());
        String a2 = String.format("%.2f", this.getCircumSphereRadius());
        String a3 = String.format("%.2f", this.getVolume());
        return super.toString() + "\n\tInsphere radius: " + a1+"cms"+"\n\tCircumsphere radius: " + a2+"cms"+"\n\tVolume: " + a3+"cm\u00b3";
    }
   
   
}
