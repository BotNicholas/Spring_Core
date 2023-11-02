package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songList;

    public RockMusic(){
        this.songList=List.of("Need 2",
                              "505",
                              "Change");
    }

    public void setSongList(List<String> songList) {
        this.songList = songList;
    }

    public List<String> getSongList() {
        return songList;
    }
}
