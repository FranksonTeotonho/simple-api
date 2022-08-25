package com.fteotonho.simpleapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApiController {

    @GetMapping("/api")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public String getGreetings() {
        return "Welcome to the Simple API!";
    }
}
