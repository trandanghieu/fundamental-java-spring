package com.spring.view;

import com.spring.service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SpringAopApplication {
	public static void main(String[] args) {
		System.out.println("Hello Word");
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("aop-second.xml");
//		String[] beans = context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beans));
//		System.out.println("===========================================================");


		// Get bean proxy and return joinpoint type at runtime
		//MovieService movieService = context.getBean("movieServiceProxy", MovieService.class);

		// Autoproxy
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("aop-second.xml");
		MovieService movieService = context.getBean("movieServiceProxy", MovieService.class);
		movieService.printName();






	}

}
