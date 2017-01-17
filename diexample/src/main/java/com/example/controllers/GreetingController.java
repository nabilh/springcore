package com.example.controllers;

import com.example.services.HelloWorldService;
import com.sun.tracing.dtrace.ArgsAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by nabil on 1/17/17.
 */
@Controller
public class GreetingController {


    private HelloWorldService helloWorldService;

    @Autowired
    public void setHelloWorldService (HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println("GreetingController.sayHello(): " + greeting);
        return greeting;
    }

}
