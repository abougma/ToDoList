package com.apprentissage.gestache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.apprentissage.controller"})
public class GestacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestacheApplication.class, args);
	}

}
