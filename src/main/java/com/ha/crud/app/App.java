package com.ha.crud.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.ha.crud.controller")
@EnableJpaRepositories("com.ha.crud.repo")
@SpringBootApplication
@EntityScan("com.ha.crud.entity")
public class App {

	/**
	 * Starting point of the spring boot application 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}