package com.lits.homework13;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Homework13Application {
	public static void main(String[] args) {SpringApplication.run(Homework13Application.class, args);}

	@Bean
	public ModelMapper maper(){
		return new ModelMapper();
	}
}
