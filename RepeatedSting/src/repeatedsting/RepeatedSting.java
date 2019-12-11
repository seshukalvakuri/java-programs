/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatedsting;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class RepeatedSting {

    /**
     * @param String
     * @param args the command line arguments
     * @return
     */
    public static long repeat(String s, long n) {

////        int i = 0;
////        StringBuilder sb = new StringBuilder();
////        while (i < n) {
////            sb.append(s);
////            i++;
////        }
//        //String iString = sb.toString();
//        //String countString = iString.substring(0, n);

        //String temp = "some text";
//        String temp = "";
//        while (temp.length() < n) {
//            long count = n - temp.length();
//            if(count - s.length() < 0 ){
//                for(int i = 0; i < count; i++ ){
//                    temp = temp + s.charAt(i);
//                }
//            }else {
//                temp = temp.concat(s);
//            }
//            
//        }
//        System.out.println(temp);

//        int itr = 0;
//        String countString = "";
//        while (itr < n) {
//            countString += s.charAt(itr);
//            itr++;
//        }
//        long count = 0;
//        for (int j = 0; j < temp.length(); j++) {
//            if (temp.charAt(j) == 'a') {
//                count++;
//            }
//        }
//        return count;
           long count = 0;
           for(int i = 0; i < s.length(); i++)
           {
               if(s.charAt(i) == 'a'){
                   count++;
               }
           }
          
           long value = count*(n/s.length());
           long rem = n%s.length();
           
           for(int j = 0; j<rem; j++){
           
               if(s.charAt(j) == 'a'){
                   value++;
               }
           }

            return value;
}




    public static void main(String[] args) {
        // TODO code application logic here
        //RepeatedSting rs = RepeatedSting();
        //long temp = 1000000000;
        System.out.println(RepeatedSting.repeat("aba", 10));

        

    }

}
