package com.example.services;

/**
 * Created by nabil on 1/17/17.
 */
public class HelloWorldServiceRussian implements HelloWorldService {

    static {
        System.out.println("HelloWorldServiceRussian");
    }

    @Override
    public String getGreeting() {
        return "Hello World in Russian!";
    }
}
