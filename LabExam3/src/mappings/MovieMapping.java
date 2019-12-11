/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappings;

import static java.lang.reflect.Array.set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Instructor
 */
public class MovieMapping implements Iterable {

    private HashMap<Person, LinkedList<Movie>> actorsActed;

    public MovieMapping() {
        this.actorsActed = new HashMap<>();
    }

    public void addMovie(Person person, Movie movie) {
//        LinkedList<Movie> movies = actorsActed.get(person);
//        if (movies == null) {
//            LinkedList<Movie> obj = new LinkedList<>();
//            obj.add(movie);
//            actorsActed.put(person, obj);
//        } else {
//            movies.add(movie);
//            actorsActed.put(person, movies);
//        }
//    }
        LinkedList<Movie> movies = actorsActed.get(person);
        if (movies == null) {
            LinkedList<Movie> addmovie = new LinkedList<>();
            addmovie.add(movie);
            actorsActed.put(person, addmovie);
        } else {
            movies.add(movie);
            actorsActed.put(person, movies);
        }
    }

    public TreeSet<String> findRevenuesMadeByDirector(String directorName) {
//        TreeSet<String> setObj = new TreeSet<>();
//       // LinkedList<Movie> m = new LinkedList<>();
//        for (Person person : actorsActed.keySet()) {
//          LinkedList<Movie> m = actorsActed.get(person);
//            for (Movie imovies : m) {
//                if (imovies.getDirector().getName().equals(directorName)) {
//                    setObj.add(imovies.getMovieRevenue());
//                }
//            }
//        }
//        return setObj;
        TreeSet<String> rset = new TreeSet<>();
        
        for (Person person : actorsActed.keySet()) {
            LinkedList<Movie>  values = new LinkedList<>();
          values = actorsActed.get(person);
            for (Movie v : values) {
                if (v.getDirector().getName().equals(directorName)) {
                    rset.add(v.getMovieRevenue());
                }
            }
        }
        return rset;
    }

    public List<Person> findActorsActed(String revenue, String releasedYear) {
//        LinkedList<Person> actor = new LinkedList<>();
//        for (Person person : actorsActed.keySet()) {
//            LinkedList<Movie> values = actorsActed.get(person);
//            for (Movie m : values) {
//                if (m.getMovieRevenue().equals(revenue) && m.getMovieReleaseYear().equals(releasedYear)) {
//                    actor.add(person);
//                }
//            }
//        }
//        return actor;
        LinkedList<Person> acted = new LinkedList<>();
        for (Person actor : actorsActed.keySet()) {
            LinkedList<Movie> values = actorsActed.get(actor);
            for (Movie v : values) {
                if (v.getMovieRevenue().equals(revenue) && v.getMovieReleaseYear().equals(releasedYear)) {
                    acted.add(actor);
                }
            }
        }
        return acted;
    }

    public HashMap<Person, LinkedList<Movie>> getActorsActed() {
        return actorsActed;
    }

    @Override
    public Iterator iterator() {
        Iterator i = actorsActed.entrySet().iterator();
        return i;
    }

    public int size() {
        return actorsActed.size();
    }

}
