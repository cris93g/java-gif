package com.treehous.giflib.model;
import java.time.LocalDate;

public class Gif {
    private String name;
    private LocalDate dateUploaded;
    private boolean favorite;
    private String username;

    public Gif(String name, LocalDate dateUploaded, boolean favorite, String username) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.favorite = favorite;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
