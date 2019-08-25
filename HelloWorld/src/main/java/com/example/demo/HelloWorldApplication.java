package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		DemoSpringBoot obj = context.getBean(DemoSpringBoot.class);
		obj.setVar(20);
		System.out.println(obj.getVar());
		DemoSpringBoot obj1 = context.getBean(DemoSpringBoot.class);
		DemoSpringBoot obj2 = context.getBean(DemoSpringBoot.class);
		
		if(obj1==obj2) {
			System.out.println("obj1==obj2");
		}
		else {
			System.out.println("obj1!=obj2");
		}
	}
}