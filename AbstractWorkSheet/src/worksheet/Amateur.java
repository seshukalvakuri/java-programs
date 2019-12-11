/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Amateur extends Exhibitor {
    private static final int PTS_NEEDED = 150;

    public Amateur() {
        super();
    }

    public Amateur(String lastname, String firstname, int year, int points) {
        super(lastname, firstname, year, points);
    }

    
    
    
    @Override
    public boolean worldShowQualified() {
       
        return super.getPoints()>PTS_NEEDED;
   
    }
    
    
}
