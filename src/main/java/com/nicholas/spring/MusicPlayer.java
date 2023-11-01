package com.nicholas.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(){}

    private MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public void playerInitialisation(){
        System.out.println("Initializing "+ name +" Music Player");
    }

    public void playerDestroy(){
        System.out.println("Destroying " + name + " Music Player");
    }

    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void play(){
        System.out.println("-----------------------------");
        System.out.println("Player: " + name + ";\nVolume: " + volume + ";");
        System.out.println("-----------------------------\n");
        System.out.println("Playing: ");
        musicList.forEach((s)-> System.out.println("\t"+s.getSong()));
    }

}
