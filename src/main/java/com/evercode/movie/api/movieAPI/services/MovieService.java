package com.evercode.movie.api.movieAPI.services;

import com.evercode.movie.api.movieAPI.dto.DataResponse;
import com.evercode.movie.api.movieAPI.dto.ProducerInterval;
import com.evercode.movie.api.movieAPI.models.entity.Movie;
import com.evercode.movie.api.movieAPI.models.entity.Producer;
import com.evercode.movie.api.movieAPI.repositories.MovieRepository;
import com.evercode.movie.api.movieAPI.repositories.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ProducerRepository producerRepositiry;

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }
    public void saveAll(Iterable<Movie> movies) {
        movieRepository.saveAll(movies);
    }

    public DataResponse getProducersIntervalMinMax() {
        List<Producer> producersWinner = this.producerRepositiry.getProducersWinners();
        DataResponse response = new DataResponse();
        Long year = null;
        for (Producer producer : producersWinner) {
            List<Movie> movies = this.movieRepository.getMoviesWinnersByProducerId(producer.getId());
            Movie lastMovie = null;
            for (Movie movie : movies) {
                if (lastMovie != null) {
                    ProducerInterval producerInterval = new ProducerInterval(producer.getName(),
                            movie.getYear().intValue() - lastMovie.getYear().intValue(),
                            lastMovie.getYear(),
                            movie.getYear());
                    response.addMax(producerInterval);
                    response.addMin(producerInterval);
                }
                lastMovie = movie;
            }
        }

        return response;
    }
}
