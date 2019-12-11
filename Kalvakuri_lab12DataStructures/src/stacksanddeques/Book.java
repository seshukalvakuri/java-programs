/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Book {
   private String title; 
   private String author;

    /**
     *
     * @param title
     * @param author
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     *this method gets the title
     * @return returns title of type string
     */
    public String getTitle() {
        return title;
    }

    /**
     *this method gets the author
     * @return returns the author name of type string
     */
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return getTitle() + "\n" + getAuthor();
    }
    
}
