package com.waldecleber.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.waldecleber.cliente", "com.waldecleber.cliente.domain"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
