package com.evercode.movie.api.movieAPI.repositories;

import com.evercode.movie.api.movieAPI.models.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("select  m " +
            "from   MovieProducer v, Producer p, Movie m " +
            "where  m.id = v.movie.id " +
            "and    p.id = v.producer.id " +
            "and    v.producer.id = :producerId and m.winner = 'S' " +
            "ORDER  BY m.year")
    List<Movie> getMoviesWinnersByProducerId(@Param("producerId") Long producerId);

}
