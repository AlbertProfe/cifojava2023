package org.example.manager;

import org.example.Model.Movie;
import org.example.view.UserInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MovieManager {

    public static HashMap<String, Movie> movies = new HashMap<String, Movie>();
    // Static method
    public static boolean createMovie(Scanner reader) {
        boolean result = false;

        String movieName = UserInterface.ask(reader, "Movie name?");

        Movie newMovie = new Movie();
        newMovie.setTitle(movieName);

        movies.put(movieName, newMovie);
        System.out.println(movies);

        // to-do
        // ask user for movie data: director
        // create Movie object
        // Movie newMovie = new Movie();
        // newMovie.setDirector(XXXXXX):
        // send new movie object to storage class
        // return result to view
        return result;
    }

    // Static method
    public static boolean deleteMovie(String idMovie) {
        boolean result = false;
        // to-do algorithmic to solve this method
        // if idMovie exists in storage/hashMap
        // hashmap.remove(movie)
        // return result
        return result;
    }

    // Static method
    public static boolean updateMovie(Movie movie) {
        boolean result = false;
        // to-do algorithmic to solve this method
        return result;
    }

    // Static method
    public static List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        // to-do algorithmic to solve this method
        return movies;
    }

    // Static method
    public static List<Movie> findMovie(String title) {
        List<Movie> movies = new ArrayList<>();
        // to-do algorithmic to solve this method
        return movies;
    }

}
