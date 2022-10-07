package com.example.backend.controller;
import com.example.backend.model.Movie;
import com.example.backend.model.MovieDTO;
import org.springframework.web.bind.annotation.*;
import com.example.backend.service.MovieDbService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/movie")

public class MovieDbController {

    private final MovieDbService movieDbService;

    public MovieDbController(MovieDbService movieDbService) {
        this.movieDbService = movieDbService;
    }


    @GetMapping("{id}")
    public Optional<Movie> getMovieById(@PathVariable String id) {
        return movieDbService.getMovieById(id);
    }

    @GetMapping
    public List<Movie>getAllMovies() {
        return movieDbService.getAllMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestBody MovieDTO newMovie) {

        return movieDbService.addMovie(newMovie);
    }

    @DeleteMapping("{id}")
    public void deleteMovie(@PathVariable String id){
        movieDbService.deleteMovie(id);
    }
}
