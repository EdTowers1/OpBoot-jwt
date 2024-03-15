package com.example.openbootcampjwt.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String index(){

        return "";
    }
}
