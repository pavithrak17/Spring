package com.tnsif.autowire;

public class Human {
	//creating the reference of heart class in human // created dependencies between human and heart using reference of heart
	private Heart heart;

	public Human() {// default constructor
		super();
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void startPumping() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.println("dead");
		}
	}
}
