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
public enum SandwichName {
    
    /**
     *veggie_delight sandwich price for footlong, six-inch and salad
     */
    VEGGIE_DELIGHT(5.49,3.99,5.78),

    /**
     *oven_roasted_chicken sandwich price for footlong, six-inch and salad
     */
    OVEN_ROASTED_CHICKEN(7.49,5.29,7.78),

    /**
     *spicy_ilalian sandwich price for footlong, six-inch and salad
     */
    SPICY_ITALIAN(6.49,4.29,6.78),

    /**
     *rotisserie_style_chicken sandwich price for footlong, six-inch and salad
     */
    ROTISSERIE_STYLE_CHICKEN(8.49,5.49,7.98),

    /**
     *turkey_breast sandwich price for footlong, six-inch and salad
     */
    TURKEY_BREAST(7.49,5.29,7.78),

    /**
     *sweet_onion_chicken_teriyaki sandwich price for footlong, six-inch and salad
     */
    SWEET_ONION_CHICKEN_TERIYAKI(7.99,5.49,7.98),

    /**
     *black_forest_ham sandwich price for footlong, six-inch and salad
     */
    BLACK_FOREST_HAM(6.49,4.29,6.78);
    
    private final double footLongPrice; //Footlong price of a sandwich in dollars
    private final double sixInchPrice;//Six-inch price of a sandwich in dollars
    private final double saladPrice; //Chopped salad price of a sandwich in dollars

    private SandwichName(double footLongPrice, double sixInchPrice, double saladPrice) {
        this.footLongPrice = footLongPrice;
        this.sixInchPrice = sixInchPrice;
        this.saladPrice = saladPrice;
    }

    /**
     *this method gets footlong price 
     * @return this method gets footlong price
     */
    public double getFootLongPrice() {
        return footLongPrice;
    }

    /**
     *this method gets six-inch price
     * @return this method gets six-inch price
     */
    public double getSixInchPrice() {
        return sixInchPrice;
    }

    /**
     *this method gets salad price
     * @return this method gets salad price
     */
    public double getSaladPrice() {
        return saladPrice;
    }
    
    

}
