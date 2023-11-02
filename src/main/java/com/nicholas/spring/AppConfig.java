package com.nicholas.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nicholas.spring")
@PropertySource("classpath:musicPlayer.properties")
public class AppConfig {
}
