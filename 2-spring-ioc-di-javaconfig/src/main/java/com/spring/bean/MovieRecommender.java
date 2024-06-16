package com.spring.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
    @Qualifier("action")
    @Autowired
    private final MovieCatalog movieCatalog;

    public MovieRecommender(@Qualifier("action") MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

    public void recommend(){
        System.out.println("->Type: " + movieCatalog.getCatalog() );
        movieCatalog.showMovie();
    }
    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will be destroyed now.");
    }

}
