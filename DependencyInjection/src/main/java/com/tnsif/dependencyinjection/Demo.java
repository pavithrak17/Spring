package com.tnsif.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("di.xml");
		System.out.println("class loaded");
		Vehicle c1=c.getBean(Car.class);
	}
}
