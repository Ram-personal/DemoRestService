package com.rest;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public GreetService() {
        System.out.println("Service:: Constructor loaded");
    }

    public String greet() {
        return "hello how are you! I am SERVICE ONE running at    :    "+ new Date().toString();
    }
}
