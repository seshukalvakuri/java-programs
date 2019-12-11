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
public class Youth extends Exhibitor {
    private static final int PTS_NEEDED = 250;
    private static final int NUMBER_OF_EVENTS= 2;
    private int numEvents;

    public Youth() {
        super();
    }

    public Youth(int numEvents, String lastname, String firstname, int year, int points) {
        super(lastname, firstname, year, points);
        this.numEvents = numEvents;
    }

   

    @Override
    public boolean worldShowQualified() {
       
        return super.getPoints()>=PTS_NEEDED && numEvents>=NUMBER_OF_EVENTS;
        }

    public int getNumEvents() {
        return numEvents;
    }

    public void setNumEvents(int numEvents) {
        this.numEvents = numEvents;
    }
      
    
    @Override
    public String toString() {
        return super.toString() + numEvents ;
    }
    
    


}
