package com.evercode.movie.api.movieAPI.repositories;


import com.evercode.movie.api.movieAPI.models.entity.MovieProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieProducerRepositiry extends JpaRepository<MovieProducer, Long> {
}
