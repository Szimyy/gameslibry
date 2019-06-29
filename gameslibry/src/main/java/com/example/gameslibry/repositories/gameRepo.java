package com.example.gameslibry.repositories;

import com.example.gameslibry.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface gameRepo extends CrudRepository<Game, Long> {
}
