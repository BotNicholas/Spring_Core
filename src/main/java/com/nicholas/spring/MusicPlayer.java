package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;
    private Music music3;

    private MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2, @Qualifier("jazzMusic") Music music3){
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    @PostConstruct
    public void playerInitialisation(){
        System.out.println("Initializing \""+ name +"\" Music Player");
        System.out.println("\n-----------------------------");
        System.out.println("Player: \"" + name + "\";\nVolume: " + volume + ";");
        System.out.println("-----------------------------");
    }

    @PreDestroy
    public void playerDestroy(){
        System.out.println("Destroying " + name + " Music Player");
    }

    public void setMusic1(Music music1) {
        this.music1 = music1;
    }

    public void setMusic2(Music music2) {
        this.music2 = music2;
    }

    public void setMusic3(Music music3) {
        this.music3 = music3;
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

    public Music getMusic1() {
        return music1;
    }

    public Music getMusic2() {
        return music2;
    }

    public Music getMusic3() {
        return music3;
    }

    public void play(MusicGenre genre){
        System.out.print("\tNow playing: ");
        switch (genre){
            case CLASSICAL:
                System.out.println(music1.getSongList().get(new Random().nextInt(0, 3)));
                break;
            case ROCK:
                System.out.println(music2.getSongList().get(new Random().nextInt(0, 3)));
                break;
            case JAZZ:
                System.out.println(music3.getSongList().get(new Random().nextInt(0, 3)));
                break;
        }
    }

}
