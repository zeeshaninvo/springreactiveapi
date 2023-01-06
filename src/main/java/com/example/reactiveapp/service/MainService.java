package com.example.reactiveapp.service;

import com.example.reactiveapp.utility.Constant;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;

@Service
public class MainService {

    public Mono<String> printData() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        return Mono.just(Constant.MSG +" - "+Thread.currentThread().getId()+" : "+ Thread.currentThread().getName());
    }
}
