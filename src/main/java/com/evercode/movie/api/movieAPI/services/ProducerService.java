package com.evercode.movie.api.movieAPI.services;

import com.evercode.movie.api.movieAPI.models.entity.Producer;
import com.evercode.movie.api.movieAPI.repositories.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private ProducerRepository producerRepositiry;

    public Producer getByName(String name) {
        return this.producerRepositiry.getEntityByName(name);
    }


    public Producer save(Producer producer) {
        return this.producerRepositiry.save(producer);
    }
}
