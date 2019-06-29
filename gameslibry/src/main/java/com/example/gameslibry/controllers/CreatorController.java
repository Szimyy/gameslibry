package com.example.gameslibry.controllers;

import com.example.gameslibry.repositories.creatorRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreatorController {

    private creatorRepo creatorRepository;

    public CreatorController(creatorRepo creatorRepository) {
        this.creatorRepository = creatorRepository;
    }

    @RequestMapping("/creator")
    public String getCreator(Model model) {

        model.addAttribute("creator", creatorRepository.findAll());

        return "creator";
    }
}
