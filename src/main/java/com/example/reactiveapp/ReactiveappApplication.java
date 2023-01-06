package com.example.reactiveapp;

import com.example.reactiveapp.config.WebClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReactiveappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveappApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	}
}
