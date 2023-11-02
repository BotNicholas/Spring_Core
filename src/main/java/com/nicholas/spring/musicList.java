package com.nicholas.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class musicList extends ArrayList<Music>{
    musicList(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic){
        super(List.of(classicalMusic, rockMusic, jazzMusic));
    }
}
