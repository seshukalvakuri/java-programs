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
public enum Veggies {
    
    /**
     *cucumber cost (in dollars) for regular and extra veggies
     */
    CUCUMBER(0.0,0.25),

    /**
     *olives cost (in dollars) for regular and extra veggies
     */
    OLIVES(0.0,0.5),

    /**
     *jalapenos cost (in dollars) for regular and extra veggies
     */
    JALAPENOS(0.0,0.75),

    /**
     *green_peppers cost (in dollars) for regular and extra veggies
     */
    GREEN_PEPPERS(0.0,0.25),

    /**
     *lettucee cost (in dollars) for regular and extra veggies
     */
    LETTUCEE(0.0,0.0),

    /**
     *RED_ONIONS cost (in dollars) for regular and extra veggies
     */
    RED_ONIONS(0.0,0.0),

    /**
     *tomatoes cost (in dollars) for regular and extra veggies
     */
    TOMATOES(0.0,0.0),

    /**
     *pickles cost (in dollars) for regular and extra veggies
     */
    PICKLES(0.0,1.0);
    
    private final double regularPrice; //Price for the regular veggies in dollars.
    private final double extraPrice; //Price for the extra veggies in dollars

    private Veggies(double regularPrice, double extraPric) {
        this.regularPrice = regularPrice;
        this.extraPrice = extraPric;
    }

    /**
     *this method returns the regular price 
     * @return this method returns the regular price 
     */
    public double getRegularPrice() {
        return regularPrice;
    }

    /**
     *this method returns the extra price 
     * @return this method returns the regular price 
     */
    public double getExtraPrice() {
        return extraPrice;
    }    
    
}
