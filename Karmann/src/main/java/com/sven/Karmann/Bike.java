package com.sven.Karmann;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	public void drive() {
		System.out.println("Bicycle fun...");
	}
	
}
