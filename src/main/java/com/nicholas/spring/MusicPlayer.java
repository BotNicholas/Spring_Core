package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

//@Component
//@Scope("prototype")
public class MusicPlayer {
//    @Value("${MusicPlayer.name}")
    private String name;
//    @Value("${MusicPlayer.volume}")
    private int volume;

    private int genresCount = 3;
    private List<Music> music;

//    private MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2, @Qualifier("jazzMusic") Music music3){
//        this.music1 = music1;
//        this.music2 = music2;
//        this.music3 = music3;
//    }

    public MusicPlayer(List<Music> music){
        this.music = music;
    }

//    @PostConstruct
    public void playerInitialisation(){
        System.out.println("Initializing \""+ name +"\" Music Player");
        System.out.println("\n-----------------------------");
        System.out.println("Player: \"" + name + "\";\nVolume: " + volume + ";");
        System.out.println("-----------------------------");
    }

//    @PreDestroy
    public void playerDestroy(){
        System.out.println("Destroying " + name + " Music Player");
    }

    public void setMusic(List<Music> music) {
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

    public List<Music> getMusic() {
        return music;
    }

    public void play(){
        System.out.print("\tPlaying: ");
        Music genre = music.get(new Random().nextInt(0, genresCount));
        System.out.println(genre.getSongList().get(new Random().nextInt(0, genre.getSongList().size()+1)));
    }

}
