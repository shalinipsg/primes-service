package com.shacheru.primesservice.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomesController {
    @GetMapping
    public String greetings(){
        return(" Welcome to Primes Service ! ");
    }
}
