/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2c;

import java.util.ArrayList;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MultiplexBookingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<TicketBooking> tikts = new ArrayList<>();
        Movie obj1 = new Movie(0.20, "James", 10, 25);
        Movie obj2 = new Movie(0.20, "Milan", 0, 25);
        Movie obj3 = new Movie(0.20, "Milan", 4, 25);

        tikts.add(obj1);
        tikts.add(obj2);
        tikts.add(obj3);

        LiveShow live1 = new LiveShow("Roma", 0, 12);
        LiveShow live2 = new LiveShow("Brown", 5, 12);

        tikts.add(live1);
        tikts.add(live2);

        for (TicketBooking t : tikts) {
            System.out.println(t.toString());
        }

        for (TicketBooking t : tikts) {
            System.out.println(t.getNumOfTickets());
        }
        int count = 0;
        for (TicketBooking t : tikts) {

            if (t.computeTotalCost() > 100) {
                count++;
            }
        }
        System.out.println("No.of Bookings over 100$ are"+count);
    }

}
