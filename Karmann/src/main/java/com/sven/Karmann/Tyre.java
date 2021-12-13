package com.sven.Karmann;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	public String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre";
	}
	

}
