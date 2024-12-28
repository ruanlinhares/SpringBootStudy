package com.linhares.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//combinação das Anotações @Configuration, @AutoConfiguration e @ComponentScan;
//Afunção FirstappApplication será a classse que comporta a função "main" que será responsável por executar nossas outras classes; 
public class FirstappApplication {

	public static void main(String[] args) {SpringApplication.run(FirstappApplication.class, args);}

}
