package com.example.config;

import com.example.services.HelloWorldFactory;
import com.example.services.HelloWorldService;
import com.example.services.HelloWorldServiceEnglish;
import com.example.services.HelloWorldServiceSpanish;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by nabil on 1/17/17.
 */
//@Configuration
public class HelloConfig {

//    @Bean
//    public HelloWorldFactory helloWorldFactory() {
//        return new HelloWorldFactory();
//    }

//    @Bean
//    @Profile({"english", "default"})
//    public HelloWorldService helloWorldServiceEnglish (HelloWorldFactory factory) {
//        return factory.createHelloWorldService("en");
//    }

//    @Bean
//    @Profile("spanish")
//    public HelloWorldService helloWorldServiceSpanish (HelloWorldFactory factory) {
//        return factory.createHelloWorldService("es");
//    }
//
//    @Bean
//    @Profile("french")
//    public HelloWorldService helloWorldServiceFrench (HelloWorldFactory factory) {
//        return factory.createHelloWorldService("fr");
//    }
//
//    @Bean
//    @Profile("german")
//    public HelloWorldService helloWorldServiceGerman (HelloWorldFactory factory) {
//        return factory.createHelloWorldService("de");
//    }
//
//    @Bean
//    @Profile("polish")
//    public HelloWorldService helloWorldServicePolish (HelloWorldFactory factory) {
//        return factory.createHelloWorldService("pl");
//    }

//    @Bean(name="russian")
//    public HelloWorldService helloWorldServiceRussian (HelloWorldFactory factory) {
//        return factory.createHelloWorldService("ru");
//    }
}
