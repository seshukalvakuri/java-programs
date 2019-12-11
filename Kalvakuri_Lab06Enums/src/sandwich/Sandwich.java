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
public class Sandwich {

    private String sandwichName;//Name of the sandwich
    private String size;//Size of the sandwich (size refers to Footlong, six-inch, or Chopped salad)
    private String bread;//Type of bread
    private String cheese;//Type of Cheese added to the sandwich
    String[] veggies;//Array to store the veggies added to the sandwich
    String[] sauces;//Array to store the sauces added to the sandwich
    private int quantity;//Number of sandwiches needed to the customer
    private double sandwichCost;//Cost of the individual sandwich

    /**
     *
     * @param sandwichName Name of the sandwich
     * @param size Size of the sandwich (size refers to Footlong, six-inch, or Chopped salad)
     * @param bread Type of bread
     * @param cheese Type of Cheese added to the sandwich
     * @param veggies Array to store the veggies added to the sandwich
     * @param sauces Array to store the sauces added to the sandwich
     * @param quantity Number of sandwiches needed to the customer
     */
    public Sandwich(String sandwichName, String size, String bread, String cheese, String[] veggies, String[] sauces, int quantity) {
        this.sandwichName = sandwichName;
        this.size = size;
        this.bread = bread;
        this.cheese = cheese;
        this.veggies = veggies;
        this.sauces = sauces;
        this.quantity = quantity;
    }

    Sandwich(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *this method returns the sandwich name
     * @return this method returns the sandwich name
     */
    public String getSandwichName() {
        return sandwichName;
    }

    /**
     *this method returns the sandwich size
     * @return this method returns the sandwich size
     */
    public String getSize() {
        return size;
    }

    /**
     *this method returns the type of bread
     * @return this method returns the type of bread
     */
    public String getBread() {
        return bread;
    }

    /**
     *this method returns the cheese type
     * @return this method returns the cheese type
     */
    public String getCheese() {
        return cheese;
    }

    /**
     *this method returns the veggies
     * @return this method returns the veggies
     */
    public String[] getVeggies() {
        return veggies;
    }

    /**
     *this method returns the sauces.
     * @return this method returns the sauces.
     */
    public String[] getSauces() {
        return sauces;
    }

    /**
     *this method returns the quantity
     * @return this method returns the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *this method gets the sandwich cost
     * @return this method gets the sandwich cost
     */
    public double getSandwichCost() {
        return this.sandwichCost;
    }

    private double calcVeggiesCost() {
        //calc cost of extra veggies and returns cost
        //'E_'
        double veggieCost = 0.0;
        Veggies presentVeggie;

        for (String veggie : this.veggies) {
            if (veggie.startsWith("E_")) {
                String veg = veggie.substring(2).toUpperCase();
                switch (veg) {
                    case "CUCUMBER":
                        presentVeggie = Veggies.CUCUMBER;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    case "OLIVES":
                        presentVeggie = Veggies.OLIVES;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    case "JALAPENOS":
                        presentVeggie = Veggies.JALAPENOS;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    case "GREEN_PEPPERS":
                        presentVeggie = Veggies.GREEN_PEPPERS;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    case "LETTUCEE":
                        presentVeggie = Veggies.LETTUCEE;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    case "RED_ONIONS":
                        presentVeggie = Veggies.RED_ONIONS;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    case "TOMATOES":
                        presentVeggie = Veggies.TOMATOES;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    case "PICKLES":
                        presentVeggie = Veggies.PICKLES;
                        veggieCost += presentVeggie.getExtraPrice();
                        break;
                    default:
                    //doNothing
                }
            }
        }
        return veggieCost;
    }

    private double calcSaucesCost() {
        double saucesCost = 0.0;
        Sauces presentSauce;
        for (String sauce : this.sauces) {
            if (sauce.startsWith("E_")) {
                String sau = sauce.substring(2).toUpperCase();
                switch (sau) {
                    case "MAYONAISE":
                        presentSauce = Sauces.MAYONAISE;
                        saucesCost += presentSauce.getExtraPrice();
                        break;
                    case "YELLOW_MUSTARD":
                        presentSauce = Sauces.YELLOW_MUSTARD;
                        saucesCost += presentSauce.getExtraPrice();
                        break;
                    case "RANCH":
                        presentSauce = Sauces.RANCH;
                        saucesCost += presentSauce.getExtraPrice();
                        break;
                    case "CHIPOTLE_SOUTHWEST":
                        presentSauce = Sauces.CHIPOTLE_SOUTHWEST;
                        saucesCost += presentSauce.getExtraPrice();
                        break;
                    case "HONEY_MUSTARD":
                        presentSauce = Sauces.HONEY_MUSTARD;
                        saucesCost += presentSauce.getExtraPrice();
                        break;
                    case "CAESER":
                        presentSauce = Sauces.CAESER;
                        saucesCost += presentSauce.getExtraPrice();
                        break;
                    default:
                    //do nothing
                }
            }
        }
        return saucesCost;
    }

    private double calcCheeseCost() {
        double cheeseCost = 0.0;
        Cheese presentCheese;
        if (this.cheese.startsWith("E_")) {
            String cheeseName = this.cheese.substring(2).toUpperCase();
            switch (cheeseName) {
                case "AMERICAN":
                    presentCheese = Cheese.AMERICAN;
                    cheeseCost += presentCheese.getExtraPrice();
                    break;
                case "PROVOLONE":
                    presentCheese = Cheese.PROVOLONE;
                    cheeseCost += presentCheese.getExtraPrice();
                    break;
                case "PEPPERJACK":
                    presentCheese = Cheese.PEPPERJACK;
                    cheeseCost += presentCheese.getExtraPrice();
                    break;
                case "MOZZERELLA":
                    presentCheese = Cheese.MOZZERELLA;
                    cheeseCost += presentCheese.getExtraPrice();
                    break;
                case "MONTERRYJACK":
                    presentCheese = Cheese.MONTERRYJACK;
                    cheeseCost += presentCheese.getExtraPrice();
                    break;
                case "NO":
                    presentCheese = Cheese.NO;
                    cheeseCost += presentCheese.getExtraPrice();
                    break;
                default:
                //do nothing
                }
        }
        return cheeseCost;
    }

    double completeOrder() {
        double totalCost = 0.0;

        this.sandwichName = this.sandwichName.toUpperCase();
        SandwichName presentSw;
        switch (this.sandwichName) {
            case "VEGGIE_DELIGHT":
                presentSw = SandwichName.VEGGIE_DELIGHT;
                switch (this.size) {
                    case "Footlong":
                        totalCost += presentSw.getFootLongPrice();
                        break;
                    case "Six-inch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Chopped Salad":
                        totalCost += presentSw.getSaladPrice();
                        break;
                }
                break;
            case "OVEN_ROASTED_CHICKEN":
                presentSw = SandwichName.OVEN_ROASTED_CHICKEN;
                switch (this.size) {
                    case "Footlong":
                        totalCost += presentSw.getFootLongPrice();
                        break;
                    case "Six-inch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Chopped Salad":
                        totalCost += presentSw.getSaladPrice();
                        break;
                }
                break;
            case "SPICY_ITALIAN":
                presentSw = SandwichName.SPICY_ITALIAN;
                switch (this.size) {
                    case "Footlong":
                        totalCost += presentSw.getFootLongPrice();
                        break;
                    case "Six-inch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Chopped Salad":
                        totalCost += presentSw.getSaladPrice();
                        break;
                }
                break;
            case "ROTISSERIE_STYLE_CHICKEN":
                presentSw = SandwichName.ROTISSERIE_STYLE_CHICKEN;
                switch (this.size) {
                    case "Footlong":
                        totalCost += presentSw.getFootLongPrice();
                        break;
                    case "Six-inch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Chopped Salad":
                        totalCost += presentSw.getSaladPrice();
                        break;
                }
                break;
            case "TURKEY_BREAST":
                presentSw = SandwichName.TURKEY_BREAST;
                switch (this.size) {
                    case "Footlong":
                        totalCost += presentSw.getFootLongPrice();
                        break;
                    case "Six-inch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Chopped Salad":
                        totalCost += presentSw.getSaladPrice();
                        break;
                }
                break;
            case "SWEET_ONION_CHICKEN_TERIYAKI":
                presentSw = SandwichName.SWEET_ONION_CHICKEN_TERIYAKI;
                switch (this.size) {
                    case "Footlong":
                        totalCost += presentSw.getFootLongPrice();
                        break;
                    case "Six-inch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Chopped Salad":
                        totalCost += presentSw.getSaladPrice();
                        break;
                }
                break;
            case "BLACK_FOREST_HAM":
                presentSw = SandwichName.BLACK_FOREST_HAM;
                switch (this.size) {
                    case "Footlong":
                        totalCost += presentSw.getFootLongPrice();
                        break;
                    case "Six-inch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Sixinch":
                        totalCost += presentSw.getSixInchPrice();
                        break;
                    case "Chopped Salad":
                        totalCost += presentSw.getSaladPrice();
                        break;
                }
                break;
            default:
            //do nothing
        }
        totalCost += this.calcCheeseCost() + this.calcSaucesCost() + this.calcVeggiesCost();
        this.sandwichCost = totalCost;
        this.sandwichCost = this.sandwichCost * this.quantity;
        return totalCost;
    }

    @Override
    public String toString() {
        String finalString = "";
        String newCheese = this.cheese;
        if (newCheese.startsWith("E_")) {
            newCheese = newCheese.replace("E_", "");
            newCheese = newCheese.concat("(extra)");
        }
        finalString = finalString.concat(newCheese);
        finalString = finalString.concat("\n");
        for(String veg: this.veggies){
            String addVeg = veg;
            if(addVeg.startsWith("E_")){
                addVeg = addVeg.replaceFirst("E_", "");
                addVeg = addVeg.concat("(extra)");
            }
            finalString = finalString.concat(addVeg);
            finalString = finalString.concat(", ");
        }
        for(String sauce: this.sauces){
            String addSauce = sauce;
            if(addSauce.startsWith("E_")){
                addSauce = addSauce.replaceFirst("E_", "");
                addSauce = addSauce.concat("(extra)");
            }
            finalString = finalString.concat(addSauce);
            finalString = finalString.concat(", ");
        }
        
        finalString = finalString.concat("\nSandwich Cost: ");
        finalString = finalString.concat(Double.toString(this.sandwichCost));
        return sandwichName + "\tQuantity: " + this.quantity + "\n" + bread + ", " + finalString;
    }

}