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
public abstract class TicketBooking {
    private String name;
    private int numOfTickets;
    private double costPerTicket;

    public TicketBooking(String name, int numOfTickets, double costPerTicket) {
        this.name = name;
        this.numOfTickets = numOfTickets;
        this.costPerTicket = costPerTicket;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }
          
    public abstract double computeTotalCost();

    @Override
    public String toString() {
        return name + "is booking" + numOfTickets + "Tickets";
    }
    
    
    
}
