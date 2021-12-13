package com.sven.Karmann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Autowired
	private Tyre tyre;

	public Tyre getTyre() {
		return this.tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("Es fährt mit..." + this.tyre);
	}

}
