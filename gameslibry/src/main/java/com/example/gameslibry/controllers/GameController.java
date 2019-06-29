package com.example.gameslibry.controllers;

import com.example.gameslibry.repositories.gameRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {

    private gameRepo gameRepository;

    public GameController(gameRepo gameRepository) { this.gameRepository = gameRepository;
    }

    @RequestMapping("/games")
    public String getGames(Model model) {

        model.addAttribute("games", gameRepository.findAll());

        return "games";
    }
}
