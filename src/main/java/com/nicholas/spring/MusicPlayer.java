package com.nicholas.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class MusicPlayer {
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;
    private Music music;


//    //is required for field based and setter based DI
//    public MusicPlayer(){}

    //If we autowire on constructor, we don't need Default constructor.
    //If constructor is single, we don't even need @Autowired annotation!
    private MusicPlayer(@Qualifier("classicalMusic") Music music){
        this.music = music;
    }

    @PostConstruct
    public void playerInitialisation(){
        System.out.println("Initializing "+ name +" Music Player");
    }

    @PreDestroy
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
        System.out.println("Playing: " + music.getSong());
    }

}
