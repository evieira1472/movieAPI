package com.evercode.movie.api.movieAPI.services;

import com.evercode.movie.api.movieAPI.models.entity.MovieProducer;
import com.evercode.movie.api.movieAPI.repositories.MovieProducerRepositiry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import java.util.List;


@SpringBootTest
@ActiveProfiles("test")
public class FileServiceTest {

    @Autowired
    private FileService fileService;

    @Autowired
    private MovieProducerRepositiry movieProducerRepositiry;

    @Test
    public void shouldCreateRecordsIntoDataBase() {
        this.fileService.buildDataFile();

        List<MovieProducer> all = this.movieProducerRepositiry.findAll();
        Assertions.assertEquals( 2, all.size());
        Assertions.assertEquals("Allan Carrer", all.get(0).getProducer().getName());
        Assertions.assertEquals("Testando a Paciencia", all.get(0).getMovie().getTitle());
        Assertions.assertEquals(1980L, all.get(0).getMovie().getYear());
        Assertions.assertEquals("Associated Film Distribution", all.get(0).getMovie().getStudios());
        Assertions.assertEquals("S", all.get(0).getMovie().getWinner());
    }
}
