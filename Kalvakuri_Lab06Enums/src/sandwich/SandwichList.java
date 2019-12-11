/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class SandwichList {
    private ArrayList<Sandwich> sandwichList = new ArrayList<Sandwich>();

    /**
     *this list returns the sandwich list
     * @return this list returns the sandwich list
     */
    public ArrayList<Sandwich> getSandwichList() {
        return sandwichList;
    }
    
    /**
     *This method will take Sandwich object as parameter and will add the sandwich to sandwichList arrayList
     * @param addNewSandwich This method will take Sandwich object as parameter and will add the sandwich to sandwichList arrayList
     */
    public void addSandwich(Sandwich addNewSandwich){
        this.sandwichList.add(addNewSandwich);
    }
    
    /**
     *this method returns the cost of all the sandwiches
     * @return this method returns the cost of all the sandwiches
     */
    public double calculateTotalCost(){
        double totalCost = 0.0;
        
        for(Sandwich eachSandwich: this.sandwichList){
            totalCost += eachSandwich.getSandwichCost();
        }
        
        return totalCost;
    }
    
    /**
     *this method returns the discount amount
     * @return this method returns the discount amount
     * @throws ParseException to handle the exceptions
     */
    public double calculateDiscount() throws ParseException{
        double totalDiscount = 0.0;
        if(Day.isWeekend()){
            totalDiscount = this.calculateTotalCost() / 2;
        }
        return totalDiscount;
    }
    
    /**
     *this method returns the total amount including the taxes
     * @return this method returns the total amount including the taxes
     * @throws ParseException
     */
    public double calculateTotalBillWithTax() throws ParseException{
        double totalBill = 0.0;
        
        totalBill = this.calculateTotalCost() - this.calculateDiscount();
        totalBill = totalBill + (totalBill * 0.086);
        
        return totalBill;
    }
    
    /**
     *this method prints the receipt 
     * @return this method prints the receipt 
     * @throws ParseException to handle the exceptions
     */
    public String printReceipt() throws ParseException{
        String receipt = "";
        
        for(Sandwich eachSandwich: this.sandwichList){
            receipt = receipt.concat(eachSandwich.toString());
            receipt = receipt.concat("\n\n");
        }
        
        receipt = receipt.concat("-----------------------------------------------------\n");
        receipt = receipt.concat("Order Total :\t$" + this.calculateTotalCost());
        receipt = receipt.concat("\nDiscount@50 :\t$" + this.calculateDiscount());
        double totalBillBeforeTax = this.calculateTotalCost() - this.calculateDiscount();
        receipt = receipt.concat("\nTax@8.6 :\t$" + Double.toString(totalBillBeforeTax*0.086));
        receipt = receipt.concat("\nTotal Amount with tax :\t$" + this.calculateTotalBillWithTax());
        receipt = receipt.concat("\n-----------------------------------------------------");
        return receipt;
    }
}
