/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public enum Cheese {
    
    /**
     *american cheese cost (in dollars) for regular and extra cheese
     */
    AMERICAN(0.0,0.8),

    /**
     *provolone cheese cost (in dollars) for regular and extra cheese
     */
    PROVOLONE(0.0,0.65),

    /**
     *pepperjack cheese cost (in dollars) for regular and extra cheese
     */
    PEPPERJACK(0.0,0.5),

    /**
     *moccerella cheese cost (in dollars) for regular and extra cheese
     */
    MOZZERELLA(0.0,1.0),

    
    MONTERRYJACK(0.0,0.75),
    /**
     *no cheese cost (in dollars) for regular and extra cheese
     */
    NO(0.0,0.0);
    
    private final double regularPrice;
    private final double extraPrice;

    private Cheese(double regularPrice , double extraPrice ) {
        this.regularPrice = regularPrice;
        this.extraPrice= extraPrice;
    }

    /**
     *this method gets the regular price 
     * @return this method gets the regular price
     */
    public double getRegularPrice() {
        return regularPrice;
    }

    /**
     *this method gets the extra price
     * @return this method gets the extra price
     */
    public double getExtraPrice() {
        return extraPrice;
    }
    
    
}
