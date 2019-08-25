package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoSpringBoot {
	int var;
	
	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	public DemoSpringBoot(){
		System.out.println("welcome to Spring Boot");
	}
}