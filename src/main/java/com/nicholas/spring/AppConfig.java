package com.nicholas.spring;

import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.nicholas.spring")
@PropertySource("classpath:musicPlayer.properties")
public class AppConfig {
//       @Bean
//    public ArrayList<Music> musicList(){
//        return new ArrayList<>(List.of(classicalMusic(), rockMusic(), jazzMusic()));
//    }

}
