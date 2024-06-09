package com.vehicle.vendors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class TransactionServiceStarter {
    public static void main(String[] args){
        SpringApplication.run(TransactionServiceStarter.class, args);
    }
}
