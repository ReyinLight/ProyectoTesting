package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("saludo")
    public String saludo(){
        return "Hevuelto!";
    }

    @GetMapping("")
    public String saludoFormal(){
        return "<h1>Buenas tardes papu</h1>";
    }
}
