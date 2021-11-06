package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping("/lazy")
    public String getLazy() {
        return "lazy pegi 1.0.2";
    }

}
