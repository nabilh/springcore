package com.example.services;

/**
 * Created by nabil on 1/17/17.
 */
public class HelloWorldServiceFrench implements HelloWorldService {

    static {
        System.out.println("HelloWorldServiceFrench");
    }


    @Override
    public String getGreeting() {
        return "Hello World in French!";
    }
}
