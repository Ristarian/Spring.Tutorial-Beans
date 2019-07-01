package com.tutorial.spring_2.springboot;

import com.tutorial.spring_2.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tutorial.spring_2")
public class Spring2Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring2Application.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();

    }
}
