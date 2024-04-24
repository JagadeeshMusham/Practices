package com.musham.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
    	
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        MyService myService = context.getBean(MyService.class);
//        myService.processData();
    	
    	System.out.println("Test");
    }
}