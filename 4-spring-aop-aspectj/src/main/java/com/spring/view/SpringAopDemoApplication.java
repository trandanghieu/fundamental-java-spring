package com.spring.view;

import com.spring.config.AppConfig;
import com.spring.service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAopDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringAopDemoApplication.class, args);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        MovieService movieService = context.getBean("movieService",MovieService.class);
        movieService.addMovie();
        movieService.updateMovie();
        System.out.println(movieService.getMovie());

        context.close();
    }

}
