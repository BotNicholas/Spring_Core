package com.nicholas.spring;

public class MusicPlayer {
    private Music music;

    private MusicPlayer(Music music){
        this.music = music;
    }

    public void play(){
        System.out.println("Now playing: " + music.getSong());
    }

}
