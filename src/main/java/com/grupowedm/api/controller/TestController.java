package com.grupowedm.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String inicio(){
        return "API ERP WEDM funcionando 🚀";
    }

}