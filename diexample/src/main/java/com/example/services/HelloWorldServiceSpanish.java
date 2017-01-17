package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nabil on 1/17/17.
 */
@Component
@Profile("spanish")
public class HelloWorldServiceSpanish implements HelloWorldService{

    static {
        System.out.println("HelloWorldServiceSpanish");
    }
    @Override
    public String getGreeting() {
        return "Hola Mundo!";
    }
}
