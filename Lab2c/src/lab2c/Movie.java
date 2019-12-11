/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2c;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Movie extends TicketBooking {
    
    private double tax;

    public Movie(double tax, String name, int numOfTickets, double costPerTicket) {
        super(name, numOfTickets, costPerTicket);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
    
    
    
    @Override
    public double computeTotalCost() {
        return  super.getNumOfTickets()*super.getCostPerTicket()+0.20*(super.getNumOfTickets()*super.getCostPerTicket());
    }

    @Override
    public String toString() {
        return super.toString()+"\nTotal Amount for Movie+Tax"+computeTotalCost();
    }
   
    
}
