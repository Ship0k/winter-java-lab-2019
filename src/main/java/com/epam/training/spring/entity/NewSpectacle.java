package com.epam.training.spring.entity;

import java.sql.Date;
import java.util.List;

public class NewSpectacle {
    private String playTitle;
    private String author;
    private int genre;
    private Date releaseDate;
    private int director;
    private Date premiere;
    private List<Integer> actor;
    private List<String> amploi;
    private List<Integer> budget;

    public String getPlayTitle() {
        return playTitle;
    }

    public void setPlayTitle(String playTitle) {
        this.playTitle = playTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public Date getPremiere() {
        return premiere;
    }

    public void setPremiere(Date premiere) {
        this.premiere = premiere;
    }

    public List<Integer> getActors() {
        return actor;
    }

    public int getActor(int num) {
        return actor.get(num);
    }

    public void setActor(List<Integer> actor) {
        this.actor = actor;
    }

    public String getAmploi(int num) {
        return amploi.get(num);
    }

    public void setAmploi(List<String> amploi) {
        this.amploi = amploi;
    }

    public int getBudget(int num) {
        return budget.get(num);
    }

    public void setBudget(List<Integer> budget) {
        this.budget = budget;
    }
}