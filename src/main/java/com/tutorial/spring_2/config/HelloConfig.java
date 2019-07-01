package com.tutorial.spring_2.config;

import com.tutorial.spring_2.service.HelloWorldService;
import com.tutorial.spring_2.service.HelloWorldServiceEnglishImpl;
import com.tutorial.spring_2.service.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }

}
