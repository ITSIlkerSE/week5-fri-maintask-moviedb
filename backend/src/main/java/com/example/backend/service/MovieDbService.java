package com.example.backend.service;

import com.example.backend.model.Movie;
import com.example.backend.model.MovieDTO;
import com.example.backend.repo.MovieDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieDbService {


    private final MovieDbRepo movieDbRepo;

    private IdService idService;

    @Autowired
    public MovieDbService(MovieDbRepo movieDbRepo, IdService idService) {
        this.movieDbRepo = movieDbRepo;
        this.idService = idService;
    }

    public Movie getMovieById(String id) {
        return movieDbRepo.getMovieById(id);
    }

    public List<Movie> getAllMovies() {
        return movieDbRepo.getAllMovies();
    }

    public Movie addMovie(MovieDTO movie) {
        Movie newMovie = Movie.builder()
                .id(IdService.generateId())
                .title(movie.getTitle())
                .url(movie.getUrl())
                .year(movie.getYear())
                .build();
        return movieDbRepo.addMovie(newMovie);

    }


    public void deleteMovie(String id) {
        movieDbRepo.deleteMovie(id);
    }
}
