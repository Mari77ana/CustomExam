package com.exam2app.ServerInSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.exam2app.ServerInSpring")// from witch package it will read data
@EnableAutoConfiguration // add config
public class ServerInSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerInSpringApplication.class, args);
	}

}
