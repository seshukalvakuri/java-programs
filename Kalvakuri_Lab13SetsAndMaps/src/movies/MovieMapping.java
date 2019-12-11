/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MovieMapping {
    private HashMap<Movie, LinkedList<Person>> moviemap;

    public MovieMapping() {
        this.moviemap = new HashMap<>();
    }

    public HashMap<Movie, LinkedList<Person>> getMoviemap() {
        return moviemap;
    }

    public void addMovieCrewPerson(Movie movie, Person person) {
        if (moviemap.containsKey(movie)) {
            LinkedList<Person> persons = moviemap.get(movie);
            persons.add(person);
            moviemap.put(movie, persons);
        } else {
            LinkedList<Person> persons = new LinkedList<>();
            persons.add(person);
            moviemap.put(movie, persons);
        }
    }

    public List<Movie> getListOfMoviesAPersonActed(String actorFullName) {
        List<Movie> movies = new ArrayList<>();
        String[] name = actorFullName.split(" ");
        for (Movie movie : moviemap.keySet()) {
            for (Actor actor : movie.getCharacters().values()) {
                if (actor.getFirstName().equals(name[0]) && actor.getLastName().equals(name[1])) {
                    movies.add(movie);
                }
            }
        }
        return movies;
    }

    public List<Technician> getAllTechnicians(String movieName) {
        List<Technician> technician = new ArrayList<>();
        for (Movie movie : moviemap.keySet()) {
            if (movie.getTitle().equals(movieName)) {
                LinkedList<Person> persons = moviemap.get(movie);
                for (Object person : persons) {
                    if (person instanceof Technician) {
                        Technician technicians = (Technician) person;
                        technician.add(technicians);
                    }
                }
                break;
            }
        }
        return technician;
    }

    public List<String> getListOfCharacterNames(String actor) {
        List<String> characters = new ArrayList<>();
        String[] name = actor.split(" ");
        for (Movie movie : moviemap.keySet()) {
            for (String character : movie.getCharacters().keySet()) {
                if ((movie.getCharacters().get(character).getFirstName().equals(name[0])) && (movie.getCharacters().get(character).getLastName().equals(name[1]))) {
                    characters.add(character);
                }
            }
        }
        return characters;
    }

    public List<Actor> getAllActors() {
        List<Actor> actors = new ArrayList<>();
        for (Movie movie : moviemap.keySet()) {
            for (Actor actor : movie.getCharacters().values()) {
                if (!actors.contains(actor)) {
                    actors.add(actor);
                }
            }
        }
        return actors;
    }

    @Override
    public String toString() {
        String movies = "";
        for (Movie movie : moviemap.keySet()) {
            List techList = getAllTechnicians(movie.getTitle());
            String technicianString = "";
            for (Object tech : techList) {
                technicianString += "\n" + tech.toString();
            }
            movies += "******************************************************\n" + movie.toString()
                    + "------------------------------------------------------\n"
                    + "Movie crew\n"
                    + "------------------------------------------------------\n"
                    + "\tName\t\t\tRole\n"
                    + "------------------------------------------------------" + technicianString + "\n\n";

        }
        return movies;
    }

}
