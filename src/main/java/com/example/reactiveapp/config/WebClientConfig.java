package com.example.reactiveapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Configuration
public class WebClientConfig {
    WebClient client = WebClient.create("http://localhost:8080");

    @Scheduled(fixedRate = 1000)
    public void getUser() {
        Mono<String> employeeMono =client.get()
                .uri("/user")
                .retrieve()
                .bodyToMono(String.class);
        employeeMono.subscribe(employee -> System.out.println(employee));
    }
}
