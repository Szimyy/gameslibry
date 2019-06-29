package com.example.gameslibry.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Creator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String firstName;
    private String Country;

    @ManyToMany
    private Set<Game> games = new HashSet<>();

    public Creator(String firstName, String Country) {
        this.firstName = firstName;
        this.Country = Country;
    }

    public Creator(String firstName, String Country, String nick, Set<Game> games) {
        this.firstName = firstName;
        this.Country = Country;
        this.games = games;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Set<Game> getGames() {
        return games = games;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
