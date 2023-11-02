package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Component("classicalMusicBean")
//@Scope("singleton")
public class ClassicalMusic implements Music{
    private List<String> songList;


    public ClassicalMusic(){
        this.songList = List.of("Lacrimosa",
                           "Caprice №24",
                           "Moon Sonata");
    }

    public void setSongList(List<String> songList) {
        this.songList = songList;
    }

    public List<String> getSongList() {
        return songList;
    }
}
