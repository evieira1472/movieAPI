package com.evercode.movie.api.movieAPI.services;

import com.evercode.movie.api.movieAPI.models.entity.MovieProducer;
import com.evercode.movie.api.movieAPI.repositories.MovieProducerRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieProducerService {

    @Autowired
    private MovieProducerRepositiry movieProducerRepositiry;



    public MovieProducer save(MovieProducer movieProducer) {
        return this.movieProducerRepositiry.save(movieProducer);
    }
}
