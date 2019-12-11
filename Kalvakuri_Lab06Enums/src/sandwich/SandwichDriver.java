/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class SandwichDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {

        Scanner newScanner = new Scanner(new File("input.txt"));
        while (newScanner.hasNextLine()) {
            SandwichList newSandwichList = new SandwichList();
            String date = newScanner.nextLine();
            Day day = new Day(date);
            do {
                Sandwich newObj = new Sandwich(newScanner.nextLine(), newScanner.nextLine(), newScanner.nextLine(), newScanner.nextLine(), newScanner.nextLine().split(","), newScanner.nextLine().split(","), newScanner.nextInt());
                if(newScanner.hasNextLine())
                    newScanner.nextLine();
                newObj.completeOrder();
                newSandwichList.addSandwich(newObj);
            } while (!newScanner.hasNext("[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]") && newScanner.hasNextLine());
            System.out.println("\n*******************\t" + date + "\t*******************\n");
            System.out.println(newSandwichList.printReceipt());
        }
        newScanner.close();
    }
}
