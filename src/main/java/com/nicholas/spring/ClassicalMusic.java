package com.nicholas.spring;

public class ClassicalMusic implements Music{
    private String song = "Lacrimosa";

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}
