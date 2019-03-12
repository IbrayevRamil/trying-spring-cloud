package com.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "book-service")
public interface HelloWorldRemoteService {

    String GET_HELLO_WORLD = "/hello";

    @GetMapping(value = GET_HELLO_WORLD)
    String getHelloWorld();

}
