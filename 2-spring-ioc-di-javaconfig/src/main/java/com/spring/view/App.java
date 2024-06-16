package com.spring.view;

import com.spring.bean.MovieCatalog;
import com.spring.bean.MovieRecommender;
import com.spring.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        printBeans(context);

        System.out.println("==============================================");

        MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
        movieRecommender.recommend();

        context.close();

    }
    public static void printBeans(ApplicationContext context){
        String[] beans = context.getBeanDefinitionNames();
        for(String bean:beans){
            System.out.println(bean);
        }
    }

}
