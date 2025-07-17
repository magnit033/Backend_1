package com.seryozha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calories {
    @GetMapping("/calories")
    public String getCalories() {
        return "Hello World";
    }
}
