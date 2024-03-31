package dev.ganesh.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepositary movieRepositary;

    public List<Movie> allMovies(){
        return movieRepositary.findAll();
    }
}
