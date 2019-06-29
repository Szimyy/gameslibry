package com.example.gameslibry.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String genre;
    private String year;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany(mappedBy = "creator")
    private Set<Creator> creators = new HashSet<>();

    public Game() {
    }
    public Game(String title, String genre, String year, Publisher publisher) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.publisher = publisher;
    }
    public Game(String title, String genre, String year, Publisher publisher, Set<Creator> creators) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.publisher = publisher;
        this.creators = creators;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Set<Creator> getCreators() {
        return creators;
    }

    public void setCreators(Set<Creator> creators) { this.creators = creators; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", year='" + year + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
