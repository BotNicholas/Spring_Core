package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component("classicalMusicBean")
//@Scope("singleton")
public class ClassicalMusic implements Music{
    @Value("Lacrimosa")
    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}
