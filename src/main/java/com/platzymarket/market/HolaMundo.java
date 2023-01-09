package com.platzymarket.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")

public class HolaMundo {
    @GetMapping("/hola")
    public String holaMundo (){
        return "nunca pares de aprender";
    }
}
