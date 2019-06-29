package com.example.gameslibry.repositories;

import com.example.gameslibry.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface publisherRepo extends CrudRepository<Publisher, Long> {
}
