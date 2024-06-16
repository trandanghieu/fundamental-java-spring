package com.spring.config;


import com.spring.bean.MovieCatalog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieConfig {

    @Bean
    @Scope("singleton")
    public MovieCatalog action(){
        return new MovieCatalog("ACTION");
    }
    @Bean
    public MovieCatalog cartoon(){
        return new MovieCatalog("Cartoon");
    }
}
