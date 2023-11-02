package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class JazzMusic implements Music{
    private List<String> songList;

    public JazzMusic(){
        this.songList=List.of("Fly Me to the Moon",
                              "Take Five",
                              "Unforgettable");
    }

    public void setSongList(List<String> songList) {
        this.songList = songList;
    }

    @Override
    public List<String> getSongList() {
        return songList;
    }
}
