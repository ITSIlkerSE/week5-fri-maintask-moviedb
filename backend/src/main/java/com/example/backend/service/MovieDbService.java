package com.example.backend.service;

import com.example.backend.model.Movie;
import com.example.backend.model.MovieDTO;
import com.example.backend.repo.MovieDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieDbService {


    private final MovieDbRepo movieDbRepo;

    private IdService idService;

    @Autowired
    public MovieDbService(MovieDbRepo movieDbRepo, IdService idService) {
        this.movieDbRepo = movieDbRepo;
        this.idService = idService;
    }

    public Optional<Movie> getMovieById(String id) {
        return movieDbRepo.findById(id);
    }

    public List<Movie> getAllMovies() {
        return movieDbRepo.findAll();
    }

    public Movie addMovie(MovieDTO movie) {
        Movie newMovie = Movie.builder()
                .id(IdService.generateId())
                .title(movie.getTitle())
                .url(movie.getUrl())
                .year(movie.getYear())
                .build();
        return movieDbRepo.save(newMovie);

    }


    public void deleteMovie(String id) {
        movieDbRepo.deleteById(id);
    }
}
