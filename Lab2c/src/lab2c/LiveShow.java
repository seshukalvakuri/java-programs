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
public class LiveShow extends TicketBooking{

    public LiveShow(String name, int numOfTickets, double costPerTicket) {
        super(name, numOfTickets, costPerTicket);
    }
    
    
    @Override
    public double computeTotalCost() {
        return super.getNumOfTickets()*super.getCostPerTicket();
    }

    @Override
    public String toString() {
        return super.toString()+"\nTotal Amount for Live Show"+computeTotalCost();
    }
    
    
}
