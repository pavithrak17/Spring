package com.tnsif.dependencyinjection;

public class Bike implements Vehicle{
	String name;
	String model;
	

	public Bike(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public Bike() {
		super();
	}

	public void info() {
		// TODO Auto-generated method stub
		
	}
}
