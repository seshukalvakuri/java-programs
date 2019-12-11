/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import enums.Genre;
import enums.MPAA_Rating;
import java.util.HashMap;

/**
 *
 * @author Kalvakuri, Lakshmi Seshu
 */
public class Movie implements Comparable<Movie> {

   private String title;
    private Genre genre;
    private MPAA_Rating rating;
    private double collections;
    private HashMap<String, Actor> characters;

    public Movie(String title, Genre genre, MPAA_Rating rating, double collections) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.collections = collections;
        this.characters = new HashMap<>();
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public MPAA_Rating getRating() {
        return rating;
    }

    public double getCollections() {
        return collections;
    }

    public HashMap<String, Actor> getCharacters() {
        return characters;
    }

    public void addCharacter(String characterName, Actor actor) {
        characters.put(characterName, actor);
    }

    @Override
    public int compareTo(Movie movie) {
        return this.genre.compareTo(movie.getGenre());
    }

    @Override
    public String toString() {
        String printCharacters = "";
        for (String character : characters.keySet()) {
            String actor = characters.get(character).toString().substring(0, characters.get(character).toString().indexOf("\t"));
            printCharacters += character + "\t\t\t" + actor + "\n";
        }
        String genre1 = "";
        switch(genre){
            case BIOGRAPHY:
                genre1 += "Biography";
                break;
            case DRAMA:
                genre1 += "Drama";
                break;
            case FANTASY:
                genre1 += "Fantasy";
                break;
            case HORROR:
                genre1 += "Horror";
                break;
            case MYSTERY:
                genre1 += "Mystery";
                break;
            case POETRY:
                genre1 += "Poetry";
                break;
            case ROMANCE:
                genre1 += "Romance";
                break;
            case SCIENCE_FICTION:
                genre1 += "Science_Fiction";
                break;
            case THRILLER:
                genre1 += "Thriller";
                break;
        }
        return title+ "\nGenre: " + genre1 + "\t\tRating: " + rating + " (" +rating.getAge() + " Years)"+ "\nCollections: $" + String.format("%.2f", collections) + "\nCast:\n"
                + "------------------------------------------------------\n"
                + "Character Played	Actor Name\n"
                + "------------------------------------------------------\n" + printCharacters;
    }

}
