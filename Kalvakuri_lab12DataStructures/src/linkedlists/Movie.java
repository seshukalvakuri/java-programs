/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Movie implements Comparable<Movie> {
    private String name;
    private String director;
    private int year;

    /**
     *
     * @param name
     * @param director
     * @param year
     */
    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    /**
     *this method gets the name
     * @return name of typ string
     */
    public String getName() {
        return name;
    }

    /**
     *this method gets the director
     * @return director of type string
     */
    public String getDirector() {
        return director;
    }

    /**
     *this method gets the year
     * @return year of type integer
     */
    public int getYear() {
        return year;
    }

    
    @Override
    public String toString() {
        return  name + " (" + year + ")" 
                + " directed by " + director;
    }

    @Override
    public int compareTo(Movie o) {
        return new Integer(year).compareTo(o.getYear());
    }
}
