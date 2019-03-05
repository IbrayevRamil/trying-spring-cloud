package com.demo.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookServiceInitializer {
    public static void main(String[] args) {
        SpringApplication.run(BookServiceInitializer.class, args);
    }
}
