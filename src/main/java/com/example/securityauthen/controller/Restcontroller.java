package com.example.securityauthen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class Restcontroller {

    @GetMapping("/getmsg")
    public String greeting(){
        return "spring security test";
    }
}
