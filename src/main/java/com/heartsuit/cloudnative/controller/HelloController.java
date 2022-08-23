package com.heartsuit.cloudnative.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Heartsuit
 * @Date 2022-08-22
 */
@RestController
@Slf4j
public class HelloController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hello() {
        return "Hi " + port;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("Parameter: {}", name);
        return "Hello " + name + ", I am on port: " + port;
    }
}
