package com.spring.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        String[] beans = context.getBeanDefinitionNames();

        for(String bean:beans){
            System.out.println(bean);
        }

        context.close();
    }

}
