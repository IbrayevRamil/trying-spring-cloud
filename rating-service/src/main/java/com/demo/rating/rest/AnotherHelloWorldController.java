package com.demo.rating.rest;

import com.demo.feign.HelloWorldRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rating-service")
public class AnotherHelloWorldController {

    private final HelloWorldRemoteService helloWorldRemoteService;

    @Autowired
    public AnotherHelloWorldController(HelloWorldRemoteService helloWorldRemoteService) {
        this.helloWorldRemoteService = helloWorldRemoteService;
    }

    @GetMapping("/rating")
    public String rating() {
        return helloWorldRemoteService.getHelloWorld();
    }
}
