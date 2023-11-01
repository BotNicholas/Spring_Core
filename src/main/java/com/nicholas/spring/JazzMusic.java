package com.nicholas.spring;

public class JazzMusic implements Music{
    private String song = "So What";

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String getSong() {
        return song;
    }
}
