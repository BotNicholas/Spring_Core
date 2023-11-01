package com.nicholas.spring;

public class MusicPlayer {
    private String name;
    private int volume;
    private Music music;

    public MusicPlayer(){}

    private MusicPlayer(Music music){
        this.music = music;
    }

    public void playerInitialisation(){
        System.out.println("Initializing "+ name +" Music Player");
    }

    public void playerDestroy(){
        System.out.println("Destroying " + name + " Music Player");
    }

    public void setMusic(Music music){
        this.music = music;
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

    public Music getMusic() {
        return music;
    }

    public void play(){
        System.out.println("-----------------------------");
        System.out.println("Player: " + name + ";\nVolume: " + volume + ";");
        System.out.println("-----------------------------\n");
        System.out.println("\tNow playing: " + music.getSong());
    }

}
