package com.seryozha.controller;

import com.seryozha.service.CaloriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calories {

    @Autowired
    private CaloriesService сaloriesService;

    @GetMapping("/calories")
    public String getCalories() {
        return сaloriesService.getCalories();
    }
}
