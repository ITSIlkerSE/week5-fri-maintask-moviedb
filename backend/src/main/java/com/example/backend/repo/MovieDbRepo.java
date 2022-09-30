package com.example.backend.repo;

import com.example.backend.model.Movie;
import com.example.backend.service.IdService;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository

public class MovieDbRepo {

    Map<String, Movie> movies = new HashMap<>();


    public List<Movie>getAllMovies() {
        return new ArrayList<>(movies.values());

    }

    public Movie getMovieById(String id) {
        return movies.get(id);
    }


    public Movie addMovie(Movie movie) {
        movies.put(movie.getId(), movie);
        return movie;

    }

    public void deleteMovie(String id) {
        movies.remove(id);
    }


}

