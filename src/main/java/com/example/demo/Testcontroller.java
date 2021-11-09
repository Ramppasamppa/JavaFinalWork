package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/")
    public String Test(){
        return "Hello dude";
    }

}
