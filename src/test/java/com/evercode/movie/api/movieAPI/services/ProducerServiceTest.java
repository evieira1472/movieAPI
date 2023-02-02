package com.evercode.movie.api.movieAPI.services;

import com.evercode.movie.api.movieAPI.models.entity.Producer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class ProducerServiceTest {

    @Autowired
    private ProducerService producerService;

    @Test
    public void souldSaveProducerAndGetByName() {
        Producer producer =  this.producerService.save(new Producer("Serj Tankian"));

        Assertions.assertNotNull(producer.getId());

        Producer producerSaved = this.producerService.getByName(producer.getName());

        Assertions.assertEquals(producerSaved.getId(), producer.getId());
        Assertions.assertEquals(producerSaved.getName(), producer.getName());
    }

}
