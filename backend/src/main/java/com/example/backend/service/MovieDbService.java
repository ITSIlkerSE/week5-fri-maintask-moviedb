package com.example.backend.service;

import com.example.backend.model.Movie;
import com.example.backend.repo.MovieDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieDbService {


    private final MovieDbRepo movieDbRepo;

    @Autowired
    public MovieDbService(MovieDbRepo movieDbRepo) {
        this.movieDbRepo = movieDbRepo;
    }

    public Movie getMovieById(String id) {
        return movieDbRepo.getMovieById(id);
    }

    public List<Movie>getAllMovies() {
        return movieDbRepo.getAllMovies();
    }

    public Movie addMovie(Movie newMovie) {
        return movieDbRepo.addMovie(newMovie.getId(), newMovie);

    }

    public Movie addMovieById(String id, Movie movie) {
        return movieDbRepo.addMovie(id, movie);


    }


}
