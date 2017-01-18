package com.example.services;

/**
 * Created by nabil on 1/17/17.
 */
public class HelloWorldServiceSpanish implements HelloWorldService{

    static {
        System.out.println("HelloWorldServiceSpanish");
    }
    @Override
    public String getGreeting() {
        return "Hola Mundo!";
    }
}
