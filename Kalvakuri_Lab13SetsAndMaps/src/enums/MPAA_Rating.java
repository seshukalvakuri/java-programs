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
public enum MPAA_Rating {
   G(0), NC_17(18), PG(12), PG_13(13), R(17);
    
    private int age;
    MPAA_Rating(int age){
        this.age = age; 
    }

    public int getAge() {
        return age;
    }
}
