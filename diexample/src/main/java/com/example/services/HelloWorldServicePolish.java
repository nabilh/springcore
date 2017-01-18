package com.example.services;

/**
 * Created by nabil on 1/17/17.
 */
public class HelloWorldServicePolish implements HelloWorldService {

    static {
        System.out.println("HelloWorldServicePolish");
    }

    @Override
    public String getGreeting() {
        return "Hello World in Polish!";
    }
}
