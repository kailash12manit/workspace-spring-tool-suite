package com.kailash.pktech;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("Bike Bhaag rahi h");
	}

}
