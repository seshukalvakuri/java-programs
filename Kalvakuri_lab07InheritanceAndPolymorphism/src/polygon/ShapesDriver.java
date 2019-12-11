/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Polygon> polygons = new ArrayList<>();
        Scanner myScanner = new Scanner(new File("shapes.txt"));
        String ratioString = "";
        while (myScanner.hasNextLine()) {
            String shape = myScanner.next();
            switch(shape){
                case "cube":
                    String sideC = myScanner.next();
                    double length = Double.parseDouble(sideC);
                    Cube newCube = new Cube(length);
                    double sArea = newCube.getArea();
                    String tAreaS = String.format("%.2f", sArea);
                    double sVolume = newCube.getVolume();
                    String tVolumeS = String.format("%.2f", sVolume);
                    ratioString = ratioString.concat("\nCube");
                    ratioString = ratioString.concat("\n\tSurface area: ");
                    ratioString = ratioString.concat(tAreaS + "cm\u00b2");
                    ratioString = ratioString.concat("\n\tVolume: ");
                    ratioString = ratioString.concat(tVolumeS + "cm\u00b3");
                    polygons.add(newCube);
                    myScanner.nextLine();
                    break;
                case "triangle":
                    String sideT = myScanner.next();
                    double sideLength = Double.parseDouble(sideT);
                    RegularPolygon newTriangle = new EquilateralTriangle(sideLength);
                    polygons.add(newTriangle);
                    myScanner.nextLine();
                    break;
                case "square":
                    String sideS = myScanner.next();
                    double sideL = Double.parseDouble(sideS);
                    RegularPolygon newSquare = new Square(sideL);
                    polygons.add(newSquare);
                    myScanner.nextLine();
                    break;
                case "tetrahedron":
                    String sideTe = myScanner.next();
                    double sideTet = Double.parseDouble(sideTe);
                    Tetrahedron newTetrahedron = new Tetrahedron(sideTet);
                    double tArea = newTetrahedron.getArea();
                    String tAreaSt = String.format("%.2f", tArea);
                    double tVolume = newTetrahedron.getVolume();
                    String tVolumeSt = String.format("%.2f", tVolume);
                    ratioString = ratioString.concat("\nTetrahedron");
                    ratioString = ratioString.concat("\n\tSurface area: ");
                    ratioString = ratioString.concat(tAreaSt + "cm\u00b2");
                    ratioString = ratioString.concat("\n\tVolume: ");
                    ratioString = ratioString.concat(tVolumeSt + "cm\u00b3");
                    polygons.add(newTetrahedron);
                    myScanner.nextLine();
                    break;
                default:
                    String name = shape;
                    String sides = myScanner.next();
                    String lengthP = myScanner.next();
                    int noSides = Integer.parseInt(sides);
                    double lengthPolygon = Double.parseDouble(lengthP);
                    Polygon newPolygon = new RegularPolygon(name, noSides, lengthPolygon);
                    polygons.add(newPolygon);
                    myScanner.nextLine();
                    break;
            }
        }
        
        for(Polygon eachPoly: polygons){
            System.out.println("*****************************************");
            System.out.println(eachPoly.toString());
        }
        
        double largestArea = 0.0;
        String largestAreaName = "";
        Double largestPerimeter = 0.0;
        String largestPerimeterName = "";
        for(Polygon eachPoly: polygons){
            if(eachPoly.getArea() > largestArea){
                largestArea = eachPoly.getArea();
                largestAreaName = eachPoly.getName();
            }
            if(eachPoly.getPerimeter() > largestPerimeter){
                largestPerimeter = eachPoly.getPerimeter();
                largestPerimeterName = eachPoly.getName();
            }
        }
        
        System.out.println("*****************************************");
        System.out.println("The polygon with largest area is " + largestAreaName + " with area of " + largestArea + "cm²");
        System.out.println("The polygon with largest perimeter is " + largestPerimeterName + " with area of " + largestPerimeter + "cms");
        System.out.println("*****************************************");
        
        if(!ratioString.isEmpty()){
            System.out.print("Surface area to Volume ratio of given solids are:");
            System.out.println(ratioString);
        }
        System.out.println("*****************************************");
        
        System.out.println("Where did you use polymorphic substitution in this project?");
        System.out.println("polymorphic substitution is used when creating an object for regular polygon with polygon class");
        System.out.println("Where did you use late binding polymorphism in this project?");
        System.out.println("late binding polymorphism is used when the super class methods are called using super keyword used in cube class,tetrahedran and regular polygon class where area method is overridden.");
    }
}
