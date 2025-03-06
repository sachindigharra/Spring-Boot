package com.example.eComApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String greet() {
        return "Hi, Welcome to Ecommeerce App!!";
    }

    @GetMapping("/about")
    public String about() {
        return "We don't teach, we Educate!!";
    }
}
