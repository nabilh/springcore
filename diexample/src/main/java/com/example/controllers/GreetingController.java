package com.example.controllers;

import com.example.services.HelloWorldService;

/**
 * Created by nabil on 1/17/17.
 */
//@Controller
public class GreetingController {

    private HelloWorldService frenchService;
    private HelloWorldService germanService;
    private HelloWorldService russianService;
    private HelloWorldService defaultService;

    public void setDefaultService(HelloWorldService defaultService) {
        this.defaultService = defaultService;
    }

    public void setFrenchService(HelloWorldService frenchService) {
        this.frenchService = frenchService;
    }

    public void setGermanService(HelloWorldService germanService) {
        this.germanService = germanService;
    }

    public void setRussianService(HelloWorldService russianService) {
        this.russianService = russianService;
    }

    public HelloWorldService getFrenchService() {
        return frenchService;
    }

    public HelloWorldService getGermanService() {
        return germanService;
    }

    public HelloWorldService getRussianService() {
        return russianService;
    }

    public HelloWorldService getDefaultService() {
        return defaultService;
    }

    public void sayHello() {
        System.out.println(defaultService.getGreeting());
        System.out.println(frenchService.getGreeting());
        System.out.println(germanService.getGreeting());
        System.out.println(russianService.getGreeting());
    }

}
