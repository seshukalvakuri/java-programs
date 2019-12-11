/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payments;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public interface Operations {

    /**
     *This is a method to know if possible to makecall.
     * @return returns boolean value
     */
    boolean canMakeCall();

    /**
     *this method is to make call
     * @param call
     * @return return boolean value.
     */
    boolean makeCall(Call call);

    /**
     *This is a method shows if data is used.
     * @param dataUsed
     * @return returns boolean value.
     */
    boolean useData(double dataUsed);

}
