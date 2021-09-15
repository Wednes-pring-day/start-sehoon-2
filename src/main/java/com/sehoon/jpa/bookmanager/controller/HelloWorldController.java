package com.sehoon.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // REST 요청
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String HelloWorld() {
        return "Hello World !";
    }

}
