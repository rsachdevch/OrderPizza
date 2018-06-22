package com.rsachdev.sandbox.Pizza;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PizzaRepository extends MongoRepository<Pizza, String> {
    Optional<Pizza> findById(String name);
    Pizza findByName(String name);
}
