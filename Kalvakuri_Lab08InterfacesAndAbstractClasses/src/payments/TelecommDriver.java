/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

import accounts.ConnectionAccount;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import rates.*;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class TelecommDriver {
     /**
     *
     * @param args
     * @throws FileNotFoundException
     * @throws ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<MobileService> connections = new ArrayList<>();
        Scanner myScanner = new Scanner(new File("usersCallLog.txt"));

        String str = myScanner.nextLine();
    
        //String t;
        Call makecall;
        double best = 0;
        Tarrif type2 = null;
        while (myScanner.hasNext()) {
            String name = str;
            String num = myScanner.nextLine();
            String type = myScanner.nextLine();
            if ("postpaid".equals(type)) {
                PostpaidService account;
                String date = myScanner.nextLine();
                double availableData = myScanner.nextDouble();
                myScanner.nextLine();
                ConnectionAccount cAccount = new ConnectionAccount(type, name, date, num);
                account = new PostpaidService(cAccount, 0, availableData);

                str = myScanner.nextLine();
                do {
                    String phone1 = str;
                    String[] Split = phone1.split("  ");
                    String phone2 = Split[0];
                    String callFrom = Split[1];
                    String callTo = Split[2];
                    String calltype = Split[3];
                    switch (calltype) {
                        case "L":
                            type2 = Tarrif.LOCAL;
                            break;
                        case "R":
                            type2 = Tarrif.ROAMING;
                            break;
                        default:
                            type2 = Tarrif.INTERNATIONAL;
                            break;
                    }
                    makecall = new Call(type2, callTo, phone1, callFrom);
                    account.makeCall(makecall);
                    if (!myScanner.hasNextLine()) {
                        break;
                    }
                    str = myScanner.nextLine();
                } while (str.contains("+"));
                connections.add(account);
            } else {
                double d = myScanner.nextDouble();
                double cost = myScanner.nextDouble();
                myScanner.nextLine();
                ConnectionAccount connection = new ConnectionAccount(type, name, num);
                PrepaidService accountType = new PrepaidService(connection, d, cost);
                str = myScanner.nextLine();
                do {
                    String cPhone = str;
                    String[] callSplit = cPhone.split("  ");
                    String pn2 = callSplit[0];
                    String from = callSplit[1];
                    String to = callSplit[2];
                    String calltype = callSplit[3];
                    switch (calltype) {
                        case "L":
                            type2 = Tarrif.LOCAL;
                            break;
                        case "R":
                            type2 = Tarrif.ROAMING;
                            break;
                        default:
                            type2 = Tarrif.INTERNATIONAL;
                            break;
                    }
                    makecall = new Call(type2, to, pn2, from);
                    accountType.makeCall(makecall);
                    if (!myScanner.hasNextLine()) {
                        break;
                    }
                    str = myScanner.nextLine();
                } while (str.contains("+"));
                connections.add(accountType);

            }
        }
        System.out.println("************************Postpaid customers invoice***************************");
        for (MobileService mobile : connections) {
            if ("postpaid".equals(mobile.getAccount().getConnectionType())) {
                System.out.println(mobile);
            }
        }
        System.out.println("************************Prepaid customers invoice***************************");
        for (MobileService mobile : connections) {
            if ("prepaid".equals(mobile.getAccount().getConnectionType())) {
                System.out.println(mobile);
            }
        }
        System.out.println("**********************Invoking useData() of customer*************************");
        for (MobileService mobile : connections) {
            if ("Robert Downey Jr.".equals(mobile.getAccount().getCustomerName())) {
                mobile.useData(156774.40);
                System.out.println(mobile);
            }
            if ("Lionel Messi".equals(mobile.getAccount().getCustomerName())) {
                mobile.useData(13516.80);
                System.out.println(mobile);
            }
            if ("Ed Sheeran".equals(mobile.getAccount().getCustomerName())) {
                mobile.useData(104427.52);
                System.out.println(mobile);
            }
        }
        System.out.println("*************************Best postpaid customer******************************");
        for (MobileService mobile : connections) {
            if ("postpaid".equals(mobile.getAccount().getConnectionType())) {
               
                PostpaidService ps = (PostpaidService) mobile;
                if (ps.finalBillAfterDiscount() > best) {
                     System.out.println("Best Customer Details:");
                    best = ps.finalBillAfterDiscount();
                    System.out.println("Customer Name:\t"+mobile.getAccount().getCustomerName());
                    System.out.println("Bill amount\t:$"+String.format("%.2f", ps.finalBillAfterDiscount()));
                }
            }

        }
    }
    
}
