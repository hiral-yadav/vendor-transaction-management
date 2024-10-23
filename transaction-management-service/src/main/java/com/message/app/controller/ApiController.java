package com.message.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {

    @GetMapping(value = "hi")
    public Mono<String> hello() {
        return Mono.just("Test");
    }
}
