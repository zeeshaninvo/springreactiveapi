package com.example.reactiveapp.controller;

import com.example.reactiveapp.service.MainService;
import com.sun.tools.javac.Main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class MainController {

    MainService mainService;

    private MainController(MainService mainService){
        this.mainService=mainService;
    }

    @GetMapping("/user")
    private Mono<String> printData() throws InterruptedException {

        return mainService.printData();
    }




}
