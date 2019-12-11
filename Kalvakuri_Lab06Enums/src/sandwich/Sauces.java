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
public enum Sauces {
    
    /**
     *Mayonaise cost (in dollars) for regular and extra sauces 
     */
    MAYONAISE(0.0,0.1),

    /**
     *yellow_mustard cost (in dollars) for regular and extra sauces 
     */
    YELLOW_MUSTARD(0.0,0.2),

    /**
     *ranch cost (in dollars) for regular and extra sauces 
     */
    RANCH(0.0,0.15),

    /**
     *chipotle_southwest cost (in dollars) for regular and extra sauces 
     */
    CHIPOTLE_SOUTHWEST(0.0,0.25),

    /**
     *honey_mustard cost (in dollars) for regular and extra sauces 
     */
    HONEY_MUSTARD(0.0,0.1),

    /**
     *caeser cost (in dollars) for regular and extra sauces 
     */
    CAESER(0.0,0.25);
    
    private final double regularPrice;
    private final double extraPrice;

    private Sauces(double regularPrice, double extraPrice) {
        this.regularPrice = regularPrice;
        this.extraPrice = extraPrice;
    }

    /**
     *this method returns the regular price of sauces
     * @return this method returns the regular price of sauces
     */
    public double getRegularPrice() {
        return regularPrice;
    }

    /**
     *this method returns the extra price of sauces
     * @return
     */
    public double getExtraPrice() {
        return extraPrice;
    }
    
    
    
}
