package com.example.backend.repo;

import com.example.backend.model.Movie;
import com.example.backend.service.IdService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository

public interface MovieDbRepo extends MongoRepository <Movie, String>{


}

