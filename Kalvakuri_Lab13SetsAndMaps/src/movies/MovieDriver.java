/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import enums.Genre;
import enums.MPAA_Rating;
import enums.Roles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class MovieDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        MovieMapping mapper  = new MovieMapping();
        Scanner myScanner = new Scanner(new File("movies.txt"));
        myScanner.nextLine();
        while (myScanner.hasNext()) {
            String mName = myScanner.nextLine();
            String m_genre = myScanner.nextLine();
            String m_genres;
            if (m_genre.contains(" ")) {
                m_genres = m_genre.replace(" ", "_");
            } else {
                m_genres = m_genre;
            }
            Genre genre = Genre.valueOf(m_genres.toUpperCase());
            String collection = myScanner.next().substring(1);
            double r_collections = Double.parseDouble(collection);
            String values = myScanner.nextLine();
            if (values.equals(" Billion") || values.equals(" billion")) {
                r_collections *= 1000000000;
            } else {
                r_collections *= 1000000;
            }
            String ratings = myScanner.nextLine();
            MPAA_Rating rating = MPAA_Rating.valueOf(ratings.toUpperCase());
            Movie movie = new Movie(mName, genre, rating, r_collections);
            String dummy = myScanner.nextLine();
            do {
                String actors;
                if (!dummy.equals("Actors")) {
                    actors = dummy;
                } else {
                    actors = myScanner.nextLine();
                }
                String[] actor_s = actors.split(" - ");
                String[] name = actor_s[1].split(" ");
                int age = myScanner.nextInt();
                myScanner.nextLine();
                String renumeration_a = myScanner.next().substring(1);
                myScanner.nextLine();
                double renumerationDouble = Double.parseDouble(renumeration_a) * 1000000;
                Actor actor = new Actor(name[0], name[1], age, renumerationDouble);
                movie.addCharacter(actor_s[0], actor);
                if (myScanner.hasNext()) {
                    dummy = myScanner.nextLine();
                } else {
                    break;
                }
            } while (!dummy.equals("Technicians"));
            do {
                String technician_names;
                if (!dummy.equals("Technicians")) {
                    technician_names = dummy;
                } else {
                    technician_names = myScanner.nextLine();
                }
                String[] technicianNames = technician_names.split(" ");
                String technicianRole = myScanner.nextLine();
                String roles;
                if (technicianRole.contains(" ")) {
                    roles = technicianRole.replace(" ", "_");
                } else {
                    roles = technicianRole;
                }
                Roles role = Roles.valueOf(roles.toUpperCase());
                Person t1 = new Technician(technicianNames[0], technicianNames[1], role);
                mapper.addMovieCrewPerson(movie, t1);
                if (myScanner.hasNext()) {
                    dummy = myScanner.nextLine();
                } else {
                    break;
                }
            } while (!dummy.equals("Movie"));
        }
        System.out.println("******************************************************\n"
                + "Details of all movies in mapper");
        System.out.print(mapper .toString().substring(0, mapper .toString().length()-1));
        System.out.println("******************************************************\n"
                + "\n"
                + "******************************************************\n"
                + "All technicians mappered with in movie Avengers\n"
                + "******************************************************");
        for (Technician tech : mapper .getAllTechnicians("Avengers: Infinity War")) {
            System.out.println(tech);
        }
        System.out.println("\n******************************************************\n"
                + "Character names of actor Prabas Raju in different movies\n"
                + "******************************************************");
        for (String movie : mapper .getListOfCharacterNames("Prabhas Raju")) {
            System.out.println(movie);
        }
        System.out.println("\n******************************************************\n"
                + "List of movies Anushka Shetty acted\n"
                + "******************************************************");
        for (Movie movie : mapper.getListOfMoviesAPersonActed("Anushka Shetty")) {
            System.out.println(movie.getTitle());
        }
        System.out.println("\n******************************************************\n"
                + "List of all actors from all movies in the mapper\n"
                + "******************************************************");
        List<Actor> actorsList = mapper.getAllActors();
        Collections.sort(actorsList);
        for (Movie movie : mapper.getMoviemap().keySet()) {
            for (Actor actorsss : actorsList) {
                for (Actor actorObj : movie.getCharacters().values()) { 
                    if (actorObj.getFirstName().equals(actorsss.getFirstName()) && actorObj.getLastName().equals(actorsss.getLastName())) {
                        System.out.println(actorsss);
                    }
                }
            }
        }
        System.out.println("\n******************************************************\n"
                + "List of all movies sorted based on gross collections in descending order\n"
                + "******************************************************");
        List<Double> collection = new ArrayList<>();
        for (Movie movie : mapper.getMoviemap().keySet()) {
            collection.add(movie.getCollections());
        }
        Collections.sort(collection, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o2, o1);
            }
        });
        for (Double d : collection) {
            for (Movie movies : mapper.getMoviemap().keySet()) {
                if (movies.getCollections() == d) {
                    System.out.println(movies.getTitle() + "\t\t$" + String.format("%.2f", d));
                }
            }
        }
    }
    
}
