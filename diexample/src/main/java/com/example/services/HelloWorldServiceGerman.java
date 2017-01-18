package com.example.services;

/**
 * Created by nabil on 1/17/17.
 */
public class HelloWorldServiceGerman implements HelloWorldService {

    static {
        System.out.println("HelloWorldServiceGerman");
    }

    @Override
    public String getGreeting() {
        return "Hello World in German!";
    }
}
