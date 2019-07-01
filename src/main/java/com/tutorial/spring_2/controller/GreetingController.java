package com.tutorial.spring_2.controller;

import com.tutorial.spring_2.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

    @Controller
    public class GreetingController {

        private HelloWorldService helloWorldService;

        @Autowired
        public void setHelloWorldService(HelloWorldService helloWorldService) {
            this.helloWorldService = helloWorldService;
        }

        public String sayHello(){

            String greeting = helloWorldService.getGreetings();

            System.out.println(greeting);

            return greeting;
        }

    }
