package com.jdvpl.jdvpl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingsController {
    @GetMapping("/welcome")
    public String welcome(){
        return  "welcome o the world of containers!";
    }
}
