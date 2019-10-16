package com.techprimers.lazy;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class GreetService {

    public GreetService() {
        System.out.println("Service:: Constructor loaded");
    }

    public String greet() {
        return "hello how are youuuuu \r\n   :    "+ new Date().toString();
    }
}
