package com.example.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by nabil on 1/17/17.
 */
@Component
@Profile({"english","default"})
public class HelloWorldServiceEnglish implements HelloWorldService  {

    static {System.out.println("HelloWorldServiceEnglish");}

    @Override
    public String getGreeting() {
        ;
        return "Hello World!";
    }
}
