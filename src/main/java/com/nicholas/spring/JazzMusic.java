package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Value("So What")
    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String getSong() {
        return song;
    }
}
