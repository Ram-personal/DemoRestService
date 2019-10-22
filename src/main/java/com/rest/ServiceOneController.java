package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceone")
public class ServiceOneController {

    @Autowired
    GreetService greetService;

    @GetMapping
    public String greet() {
        return greetService.greet();
    }
}
