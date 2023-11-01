package com.nicholas.spring;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(){}

    private MusicPlayer(Music music){
        this.music = music;
    }


    public void setMusic(Music music){
        this.music = music;
    }

    public void play(){
        System.out.println("Now playing: " + music.getSong());
    }

}
