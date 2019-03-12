package com.demo.book.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/book-service")
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }

}
