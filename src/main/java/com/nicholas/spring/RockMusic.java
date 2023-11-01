package com.nicholas.spring;

public class RockMusic implements Music{
    private String song="Bohemain Rapsody";

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}
