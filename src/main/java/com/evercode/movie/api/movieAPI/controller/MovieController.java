package com.evercode.movie.api.movieAPI.controller;

import com.evercode.movie.api.movieAPI.dto.DataResponse;
import com.evercode.movie.api.movieAPI.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/movie")
@CrossOrigin(origins="*")
public class MovieController  {

    @Autowired
    private MovieService movieService;

    @GetMapping("/producers/interval")
    private DataResponse getProducersIntervalMinMax() {
        return this.movieService.getProducersIntervalMinMax();
    }
}
