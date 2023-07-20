package dev.ivalop81.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    // 1- return a simple text String
    // @GetMapping
    // public String allMovies() {
    //    return "All movies!";
    // }

    // 2- return a simple String too, but you could check in a terminal with curl -i ...
    // @GetMapping
    // public ResponseEntity<String> getAllMovies() {
    //    return new ResponseEntity<String>("All movies!", HttpStatus.OK);
    // }

    // 3- retrieving data from mongodb
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }


}
