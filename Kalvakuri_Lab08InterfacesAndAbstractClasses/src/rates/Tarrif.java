/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rates;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public enum Tarrif {
   LOCAL(19, 20), ROAMING(29,30), INTERNATIONAL(69,70);

     private final double postpaid;
    private final double prepaid;

    private Tarrif(double postpaid, double prepaid) {
        this.postpaid = postpaid;
        this.prepaid = prepaid;
    }

    /**
     *<P. This is getter method of postpaid</p>
     * @return
     */
    public double getPostpaid() {
        return postpaid;
    }

    /**
     *
     * @return
     */
    public double getPrepaid() {
        return prepaid;
    }
    
    
}