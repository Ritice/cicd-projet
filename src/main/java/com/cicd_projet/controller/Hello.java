package com.cicd_projet.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Hello {

    @GetMapping("/say")
    public String SayHello(){
        return "Bonjour a tout le monde";
    }
}
