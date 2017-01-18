package com.example.services;

/**
 * Created by nabil on 1/17/17.
 */
public class HelloWorldServiceEnglish implements HelloWorldService  {

    static {System.out.println("HelloWorldServiceEnglish");}

    @Override
    public String getGreeting() {
        ;
        return "Hello World!";
    }
}
