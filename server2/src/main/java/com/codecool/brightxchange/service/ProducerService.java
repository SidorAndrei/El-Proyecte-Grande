package com.codecool.brightxchange.service;

import com.codecool.brightxchange.model.Producer;
import com.codecool.brightxchange.repositories.ProducerRepository;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final ProducerRepository repository;

    public ProducerService(ProducerRepository repository) {
        this.repository = repository;
    }

    public void addProducerService(Producer producer) {
        repository.save(producer);

    }
}
