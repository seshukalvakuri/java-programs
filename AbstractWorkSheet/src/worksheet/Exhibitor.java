/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public abstract class Exhibitor {
    private String lastname;
    private String firstname;
    private int year;
    private int points;

    public Exhibitor() {
      lastname=null;
      firstname=null;
      year=0;
      points=0;
    }

    public Exhibitor(String lastname, String firstname, int year, int points) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.year = year;
        this.points = points;
    }
    
    

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Exhibitor{" + "lastname=" + lastname + ", firstname=" + firstname + ", year=" + year + ", points=" + points + '}';
    }
    
    public abstract boolean worldShowQualified();
    
    
}
