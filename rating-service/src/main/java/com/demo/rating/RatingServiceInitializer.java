package com.demo.rating;

import com.demo.feign.FeignClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableEurekaClient
@Import({FeignClientConfiguration.class})
public class RatingServiceInitializer {
    public static void main(String[] args) {
        SpringApplication.run(RatingServiceInitializer.class, args);
    }
}
