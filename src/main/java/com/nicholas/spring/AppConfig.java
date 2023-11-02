package com.nicholas.spring;

import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public ArrayList<Music> musicList(){
        return new ArrayList<>(List.of(classicalMusic(), rockMusic(), jazzMusic()));
    }



    @Bean
    public MusicPlayer musicPlayer(){
        MusicPlayer musicPlayer = new MusicPlayer(musicList());
        musicPlayer.setName("Test player");
        musicPlayer.setVolume(10);
        return musicPlayer;
    }

    @PostConstruct
    public void musicPlayerInit(){
        MusicPlayer player = musicPlayer();

        System.out.println("Initializing \""+ player.getName() +"\" Music Player");
        System.out.println("\n-----------------------------");
        System.out.println("Player: \"" + player.getName() + "\";\nVolume: " + player.getVolume() + ";");
        System.out.println("-----------------------------");
    }

    @PreDestroy
    public void musicPlayerDestroy(){
        System.out.println("Destroying Music Player...");
    }


}
