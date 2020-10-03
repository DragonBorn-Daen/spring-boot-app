package com.springboot.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! This is actually supposed to be a home page. " +
                "But if you're seeing this, then we're probably under maintenance!";
    }
}
