package com.evercode.movie.api.movieAPI.services;

import com.evercode.movie.api.movieAPI.models.entity.Movie;
import com.evercode.movie.api.movieAPI.models.entity.MovieProducer;
import com.evercode.movie.api.movieAPI.models.entity.Producer;
import com.evercode.movie.api.movieAPI.repositories.MovieRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MovieProducerServiceTest {

    @Autowired
    private MovieProducerService movieProducerService;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ProducerService producerService;

    @Test
    public void shouldSaveMovieProducer() {
        Movie movie = new Movie(1999L, "Loucademia de Polícia", "Lumia Studio", "S");
        Producer producer = new Producer("Ronald Mc Donalds");

        movie = this.movieRepository.save(movie);
        producer = this.producerService.save(producer);

        final MovieProducer movieProducer = this.movieProducerService.save(new MovieProducer(movie, producer));

        Assertions.assertNotNull(movieProducer.getId());
        Assertions.assertEquals(movieProducer.getMovie().getId(), movie.getId());
        Assertions.assertEquals(movieProducer.getMovie().getYear() , movie.getYear());
        Assertions.assertEquals(movieProducer.getMovie().getWinner() , movie.getWinner());
        Assertions.assertEquals(movieProducer.getMovie().getTitle() , movie.getTitle());
        Assertions.assertEquals(movieProducer.getMovie().getStudios() , movie.getStudios());

        Assertions.assertEquals(movieProducer.getProducer().getId() , producer.getId());
        Assertions.assertEquals(movieProducer.getProducer().getName() , producer.getName());
    }

}
