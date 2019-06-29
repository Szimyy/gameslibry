package com.example.gameslibry.tools;

import com.example.gameslibry.model.Creator;
import com.example.gameslibry.model.Game;
import com.example.gameslibry.model.Publisher;
import com.example.gameslibry.repositories.creatorRepo;
import com.example.gameslibry.repositories.gameRepo;
import com.example.gameslibry.repositories.publisherRepo;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.*;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(creatorRepo creatorRepository, gameRepo gameRepository, publisherRepo publisherRepository) {
        this.creatorRepository = creatorRepository;
        this.gameRepository = gameRepository;
        this.publisherRepository = publisherRepository;
    }

    private creatorRepo creatorRepository;
    private gameRepo gameRepository;
    private publisherRepo publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData() {

        Creator Rockstar = new Creator("Rocksar Games North", "United Kingdom");
        Publisher Rock = new Publisher("Rockstar Games North");
        Game GTA = new Game("Grand Theft Auto","Action","2013",Rock);
        Rockstar.getGames().add(GTA);
        GTA.getCreators().add(Rockstar);
        publisherRepository.save(Rock);
        creatorRepository.save(Rockstar);
        gameRepository.save(GTA);

        Creator Red = new Creator("CD Project Red", "Poland");
        Publisher CDRed = new Publisher("CD Project Red");
        Game Witcher = new Game("The Witcher 3", "Adventure","2015 ", CDRed);
        Red.getGames().add(Witcher);
        Witcher.getCreators().add(Red);
        publisherRepository.save(CDRed);
        creatorRepository.save(Red);
        gameRepository.save(Witcher);

        Creator shiger = new Creator("Shigeru Miyamoto", "Japan");
        Publisher Nintendo = new Publisher("Nintendo");
        Game Mario = new Game("Super Mario Bros 3", "Platform", "1988", Nintendo);
        shiger.getGames().add(Mario);
        Mario.getCreators().add(shiger);
        publisherRepository.save(Nintendo);
        creatorRepository.save(shiger);
        gameRepository.save(Mario);

    }


}
