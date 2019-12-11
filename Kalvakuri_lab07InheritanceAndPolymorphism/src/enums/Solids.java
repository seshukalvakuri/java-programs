/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public enum Solids {
    
    /**
     *. The enum holds the number of faces of tetrahedron,cube,box which are constants
     */
    TETRAHEDRON(4),CUBE(6),BOX(6);
 private int noFaces;

    Solids(int noFaces) {
        this.noFaces = noFaces;
    }

    /**
     *getter method and returns the number of faces 
     * @return gets the number of faces 
     */
    public int getNoFaces() {
        return noFaces;
    }
 
 
    
}
