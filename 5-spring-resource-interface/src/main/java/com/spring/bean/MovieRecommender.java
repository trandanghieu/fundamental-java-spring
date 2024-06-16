package com.spring.bean;

public class MovieRecommender {
    private MovieCatalog movieCatalog;

    public MovieRecommender(MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

    public void recommend() {
        System.out.println("Type: " + movieCatalog.getCatalog());
        movieCatalog.showMovie();
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will be destroyed now.");
    }
}
