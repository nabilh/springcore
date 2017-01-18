package com.example.services;

/**
 * Created by nabil on 1/17/17.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService (String language) {

        HelloWorldService service = null;

        switch (language) {
            case "en":
                service = new HelloWorldServiceEnglish();
                break;
            case "es":
                service = new HelloWorldServiceSpanish();
                break;
            case "fr":
                service = new HelloWorldServiceFrench();
                break;
            case "de":
                service = new HelloWorldServiceGerman();
                break;
            case "pl":
                service = new HelloWorldServicePolish();
                break;
            case "ru":
                service = new HelloWorldServiceRussian();
                break;
            default:  service = new HelloWorldServiceEnglish();
                break;
        }

        return service;
    }

}
