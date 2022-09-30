package com.example.backend.controller;
import com.example.backend.model.Movie;
import org.springframework.web.bind.annotation.*;
import com.example.backend.service.MovieDbService;

import java.util.List;

@RestController
@RequestMapping("api/movie")

public class MovieDbController {

    private final MovieDbService movieDbService;

    public MovieDbController(MovieDbService movieDbService) {
        this.movieDbService = movieDbService;
    }


    @GetMapping("{id}")
    public Movie getMovieById(@PathVariable String id) {
        return movieDbService.getMovieById(id);
    }

    @GetMapping
    public List<Movie>getAllMovies() {
        return movieDbService.getAllMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie newMovie) {

        return movieDbService.addMovie(newMovie);
    }

    @PutMapping("{id}")
    public Movie addMovieById(@PathVariable String id, @RequestBody Movie movie) {
        return movieDbService.addMovieById(id, movie);

    }
}
