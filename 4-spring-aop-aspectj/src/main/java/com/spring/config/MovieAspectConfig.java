package com.spring.config;

import com.spring.aspect.MovieLogAspect;
import com.spring.service.MovieService;
import com.spring.service.MovieServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Proxy = Advisor + JoinPoint
@Configuration
public class MovieAspectConfig {

    //JointPoint
    @Bean
    public MovieService movieService(){
        return new MovieServiceImpl();
    }
    //Advisor = PointCut + Advice = Aspect
    @Bean
    public MovieLogAspect movieLogAspect(){
        return  new MovieLogAspect();
    }
}
