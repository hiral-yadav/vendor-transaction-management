package com.app.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableAutoConfiguration
public class ApplicationStartup {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
